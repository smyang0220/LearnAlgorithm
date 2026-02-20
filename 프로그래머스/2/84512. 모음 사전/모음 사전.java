import java.util.*;

class Solution {
    
      public static final char[] words = "AEIOU".toCharArray();
    
    private List<String> make(String word){
        
        List<String> list = new ArrayList<>();
        list.add(word);
        
        if(word.length() == 5) return list;
        
        for(char c : words){
            list.addAll(make(word+c));
        }
        return list;
    }
    
    public int solution(String word) {
        return make("").indexOf(word);
    }
}