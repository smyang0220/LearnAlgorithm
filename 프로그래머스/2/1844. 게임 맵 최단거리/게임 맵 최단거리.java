import java.util.*;

class Solution {
    // 여기에 Node 클래스를 내부 클래스로 정의
    class Node {
        int x, y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    // 방향 벡터 정의
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        // BFS를 위한 큐 생성
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(0, 0));
        
        // 시작점은 이미 방문했으므로 거리는 1
        maps[0][0] = 1;
        
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            int x = cur.x;
            int y = cur.y;
            
            // 현재 위치가 목적지인 경우
            if (x == n - 1 && y == m - 1) {
                return maps[x][y];
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                // 경계 체크 및 방문하지 않은 길(1)인지 확인
                if (nx < 0 || nx >= n || ny < 0 || ny >= m || maps[nx][ny] != 1) continue;
                
                // 새 위치의 거리 = 현재 위치 거리 + 1
                maps[nx][ny] = maps[x][y] + 1;
                queue.offer(new Node(nx, ny));
            }
        }
        
        // 목적지에 도달하지 못했을 경우
        return -1;
    }
}