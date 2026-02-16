class Solution {
    private final int[] dx = {0,-1,1,0};
    private final int[] dy = {-1,0,0,1};
    
    private boolean menheton(char[][] map){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(map[i][j] != 'P') continue;
                if(!menheton(map,i,j)) return false; 
            }
        }
        return true;
    }
    
    // false가 나오면 거리미준수
    private boolean menheton(char[][] map,int x,int y){
        for(int d = 0; d < 4; d++){
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(ny < 0 || ny >= 5 || nx < 0 || nx >= 5) continue;
            switch(map[ny][nx]) {
                case 'P' : return false;
                case 'O' : 
                    if(!isNextPerson(map,nx,ny,d)) return false;
                    break;
            }
            }
        return true;
    }
    
    private boolean isNextPerson(char[][] map, int x, int y,int d){
        for(int i = 0; i < 4; i++){
            if(i == 3-d) continue;
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(ny < 0 || ny >= 5 || nx < 0 || nx >= 5) continue;
            if(map[ny][nx] == 'P') return false;
        }
        return true;
    }
    
    
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        
        for(int T = 0; T < places.length; T++){
            
            char[][] map = new char[5][5];
            for(int i = 0 ; i < 5; i++){
                for(int j = 0; j < 5 ; j++){
                    map[i][j] = places[T][i].charAt(j);
                }
            }
            
            if(menheton(map)){
              answer[T] = 1;
            } else{
              answer[T] = 0;
            }
            
        }
        
        return answer;
    }
}