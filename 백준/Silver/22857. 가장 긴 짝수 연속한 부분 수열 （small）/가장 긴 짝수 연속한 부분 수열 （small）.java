import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
// https://www.acmicpc.net/problem/22857
public class Main {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken()); // 8
        int K = Integer.parseInt(st.nextToken()); // 2

        int[] arr = new int[S];
        String[] tmp = br.readLine().split(" ");
        for(int i = 0; i < S; i++){
            arr[i] = Integer.parseInt(tmp[i]);
        }


        int[][] dp = new int[S+1][K+1];
        int max = 0;

        for(int i = 1; i<= S; i++){
            for(int j = 0; j <= K; j++){

                if(arr[i-1] % 2 == 0){
                    dp[i][j] = dp[i-1][j] + 1;
                }
                else{
                    if(j > 0){
                        dp[i][j] = dp[i-1][j-1];
                    }
                }

                    max = Math.max(max,dp[i][j]);

            }
        }
        System.out.println(max);


    }
   

}
