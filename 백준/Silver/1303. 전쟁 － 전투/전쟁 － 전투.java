import java.io.*;
import java.util.*;

class Point {
    int x, y;
    Point(int x, int y) { this.x = x; this.y = y; }
}

public class Main {
    static char[][] arr;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static int width, height, first = 0, second = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        width = Integer.parseInt(st.nextToken());
        height = Integer.parseInt(st.nextToken());

        arr = new char[height][width];
        visited = new boolean[height][width];

        for (int i = 0; i < height; i++) {
            arr[i] = bf.readLine().toCharArray();
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (!visited[i][j]) {
                    int cnt = bfs(i, j, arr[i][j]);
                    if (arr[i][j] == 'W') first += cnt * cnt;
                    else second += cnt * cnt;
                }
            }
        }
        System.out.printf("%d %d\n", first, second);
    }

    public static int bfs(int x, int y, char c) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        visited[x][y] = true;
        int num = 1;

        while (!q.isEmpty()) {
            Point p = q.poll();
            for (int i = 0; i < 4; i++) {
                int a = p.x + dx[i];
                int b = p.y + dy[i];
                if (a < 0 || a >= height || b < 0 || b >= width) continue;
                if (visited[a][b]) continue;
                if (arr[a][b] != c) continue;
                visited[a][b] = true;   // ★ 큐에 넣기 전에 방문 체크!
                num++;
                q.offer(new Point(a, b));
            }
        }
        return num;
    }
}
