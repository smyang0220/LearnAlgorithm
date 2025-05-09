import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static int[] friend;
    public static int[] money;

    public static void main(String[] args) throws IOException {

        // 친구의 친구의 친구는 친구의 친구의 친구다
        // 5 3 20 : 학생수, 친구관계수, 돈
        // 10 10 20 20 30 , 각자 원하는 친구비
        // 1 3  // 친구관계, 자신과 자가 자신일수도있고, 같은 친구관계 여러번 일수도.
        // 2 4
        // 5 4
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 전체 친구수
        int M = Integer.parseInt(st.nextToken()); // 임력되는 친구 관계 수
        int k = Integer.parseInt(st.nextToken()); // 돈 
        int answer = 0;

        friend = new int[N+1];
        for(int i =1; i<=N; i++){
            friend[i] = i;
        }

        money = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            money[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i< M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            union(a, b); // 친구관계 일치작업
        }

        for(int i = 1; i<=N; i++){
            if(find(i) == i){
                answer += money[i];
            }
        }


        if(k < answer) System.out.println("Oh no");
        else{
            System.out.println(answer);
        }

    }

    public static void union(int a, int b){
        int x = find(a);
        int y = find(b); // 부모를 꺼내는 거잖아 ? 근데 부모를 왜꺼냄 고조할머니를 꺼내야지

        if(x!=y){
            // 친구비를 더 적게 받는 녀석을 기준으로 해야함
            if(money[x] < money[y]) friend[y] = x;
            else {
                friend[x] = y;
            }
        }

    }

    public static int find(int num){

        if(num == friend[num]) return num;
        else{
            return friend[num] = find(friend[num]);
        }

    }
  
}
