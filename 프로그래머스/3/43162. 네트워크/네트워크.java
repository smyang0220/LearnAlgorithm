import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        
        for(int i=0; i<computers.length; i++){
            if(!visited[i]){
                 answer++;
                 dfs(i,visited,computers);
            }
        }
        
        return answer;
    }
    
    static void dfs(int node,boolean[] visited, int[][] computers){
        visited[node] = true;
        for(int i = 0; i < visited.length; i++){
            if(visited[i] == false && computers[node][i] == 1){
                dfs(i,visited,computers);
            }
        }
    }
}