import java.util.*;

public class Main {

    static boolean[] visited;
    static int[] res;


    static void permutation(int N, int depth){
        if (depth == N){
            for(int num: res){
                System.out.print(num+" ");
            }
            System.out.println();
        }

        for(int i = 1; i<=N; i++){

            if(visited[i]){
                continue;
            }
            visited[i] = true;
            res[depth] = i;
            permutation(N, depth+1);
            visited[i] = false;
        }
        

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        visited = new boolean[N+1];
        res = new int[N];

        permutation(N, 0);

    }
}
