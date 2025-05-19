import java.io.*;
import java.util.*;

public class Main {
    static int N, M, V;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    static int[][] arr;
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        arr = new int[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            arr[first][second] = arr[second][first] = 1;
        }

        dfs(V);
        sb.append("\n");
        visited = new boolean[N + 1];
        bfs(V);
        System.out.println(sb);
    }

    public static void dfs(int start) {
        visited[start] = true;
        sb.append(start).append(" ");
        for (int i = 1; i <= N; i++) {  // Fixed loop start from 1
            if (arr[start][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int start) {
        visited[start] = true;
        q.add(start);
        while (!q.isEmpty()) {
            int a = q.poll();
            sb.append(a).append(" ");  // Fixed: Append current node 'a'
            for (int i = 1; i <= N; i++) {
                if (arr[a][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
