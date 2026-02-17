class Solution {
    
    private char pushLetter(char c, int n){
        if(c < 'A' || c > 'Z' && c < 'a' || c > 'z') return c;
        
        char position = Character.isUpperCase(c) ? 'A' : 'a';
        char result = (char) ((c - position + n ) % 26 + position);
        
        return result;
        
    }
    
    public String solution(String s, int n) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : chars){
            sb.append(pushLetter(c , n));
        }
        return sb.toString();
    }
}