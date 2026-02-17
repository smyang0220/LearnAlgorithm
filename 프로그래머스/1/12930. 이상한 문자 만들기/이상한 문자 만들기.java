class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int n = 0; 
        for(char c : s.toCharArray()){
            if(!Character.isAlphabetic(c)){
                n = 0;
                sb.append(c);
                continue;
            }
            
            n++;
            if(n % 2 == 0){
                sb.append(Character.toLowerCase(c));
            }else{
                sb.append(Character.toUpperCase(c));
            }
            
        }
        return sb.toString();
    }
}