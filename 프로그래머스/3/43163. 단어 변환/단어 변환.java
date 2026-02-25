import java.util.*;

class Solution {
    
    private class TMP{
        String str;
        int depth;
        TMP(String str, int depth){
            this.str = str;
            this.depth = depth;
        }
    }
    
    private boolean isOneDiff(String str1, String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        int diff = 0;
        for(int i = 0 ; i < str1.length(); i++){
            if(arr1[i] != arr2[i]) diff++;
        }
        
        return diff == 1;
        
    }
    
    public int solution(String begin, String target, String[] words) {
        // 같은게 딱 두개라면 하나 올라간거라고 볼 수 있지
        
        Queue<TMP> q = new LinkedList<>();
        q.add(new TMP(begin, 0));
        boolean[] isVisited = new boolean[words.length];
        
        
        
        while(!q.isEmpty()){
            TMP t = q.poll();
            String str = t.str;
            int count = t.depth;
            
            if(str.equals(target)) return count;
            
            for(int i = 0 ; i < words.length; i++){
              if(!isOneDiff(str, words[i]) || isVisited[i]){
                 continue;
              }
                
              isVisited[i] = true;
              q.add(new TMP(words[i],count+1));
              
              
              
            }
        }
        
        
        
        return 0;
    }
}