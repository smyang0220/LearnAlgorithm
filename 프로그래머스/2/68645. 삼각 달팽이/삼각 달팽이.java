class Solution {
    private static int[] dx = {0,1,-1};
    private static int[] dy = {1,0,-1};
    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
        int x = 0;
        int y = 0;
        int d = 0;
        int v = 1;
        while(true){
            triangle[y][x] = v++;
            int nx = x + dx[d];
            int ny = y + dy[d];
            
            if(nx == -1 || nx == n || ny == -1 || ny ==n || triangle[ny][nx] != 0){
                d = (d+1) % 3;
                nx = x + dx[d];
                ny = y + dy[d];
                if(nx == -1 || nx == n || ny == -1 || ny ==n || triangle[ny][nx] != 0){
                    break;
                }
            }
            
            x = nx;
            y = ny;
            
        }// while end
        
        int[] answer = new int[v-1];
        int index = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j < i+1; j++){
                answer[index++] = triangle[i][j];
            }
        }
        
        return answer;
    }
}