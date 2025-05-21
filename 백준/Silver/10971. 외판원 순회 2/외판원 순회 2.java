import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] W;
    static int[][] dp;
    static final int INF = 10000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        W = new int[N][N];
        dp = new int[N][1 << N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                W[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = tsp(0, 1);
        System.out.println(result);
    }

    static int tsp(int city, int visited) {
        if (visited == (1 << N) - 1) {
            if (W[city][0] == 0) return INF;
            return W[city][0];
        }

        if (dp[city][visited] != 0) return dp[city][visited];

        int min = INF;
        for (int i = 0; i < N; i++) {
            if ((visited & (1 << i)) == 0 && W[city][i] != 0) {
                min = Math.min(min, tsp(i, visited | (1 << i)) + W[city][i]);
            }
        }
        dp[city][visited] = min;
        return min;
    }
}
