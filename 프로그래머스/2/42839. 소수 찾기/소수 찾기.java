import java.util.*;

class Solution {
    
    HashSet<Integer> set;
    boolean[] visited;
    
    private void dfs(String s,String num,int depth){
        
        if(!num.isEmpty()){
            set.add( Integer.parseInt(num));
        }
        
        if(depth == s.length()){
            return;
        }
        
        for(int i = 0; i < s.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(s,num + s.charAt(i), depth + 1);
                visited[i] = false;
            }
        }
    }
    
    private boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        
        if(num == 2){
            return true;
        }
        
        if(num % 2 == 0){
            return false;
        }
        
        for(int i = 3; i <= (int) Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public int solution(String numbers) {
        
        set = new HashSet<>();
        visited = new boolean[numbers.length()];
        int answer = 0;
        
        dfs(numbers,"",0);
        
        for(Integer number : set){
            if (isPrime(number)) answer++;
        }
        
        return answer;
    }
}