import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static boolean[] arr;
    static int answer;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        answer = 0;
        arr = new boolean[Integer.parseInt(st.nextToken())];
        Arrays.fill(arr,false);
        N = Integer.parseInt(st.nextToken());

        dfs(0,0);

        System.out.println(answer);        
    }

    static public void dfs(int start, int depth){
        if(depth == N){
            answer++;
            return;
        }
        for(int i = start; i < arr.length; i++){
            if(!arr[i]){
                arr[i] = true;
                dfs(i+1,depth+1);
                arr[i] = false;
            }
        }
    }
}