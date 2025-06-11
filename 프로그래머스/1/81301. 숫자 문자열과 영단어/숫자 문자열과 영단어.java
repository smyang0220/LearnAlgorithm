class Solution {
    
    static StringBuilder sb;
    static StringBuilder answer;
    
    public int solution(String s) {
        
        answer = new StringBuilder();
        sb = new StringBuilder();
        
        String[] strs = s.split("");
        
        for(String str : strs){
            
            char c = str.charAt(0);
            if (c >= '0' && c <= '9') {
                answer.append(c);
            } else{
                sb.append(str);
                if(check(sb.toString())){
                    sb = new StringBuilder();
                }
            }
        }
        
        
        return Integer.parseInt(answer.toString());
    }
    
    public boolean check(String str){
        switch(str){
            case "one":
                answer.append(1);
                return true;
            case "two":
                answer.append(2);
                return true;
            case "three":
                answer.append(3);
                return true;
            case "four":
                answer.append(4);
                return true;
            case "five":
                answer.append(5);
                return true;
            case "six":
                answer.append(6);
                return true;
            case "seven":
                answer.append(7);
                return true;
            case "eight":
                answer.append(8);
                return true;
            case "nine":
                answer.append(9);
                return true;
            case "zero":
                answer.append(0);
                return true;
            default:
                return false;
        }
    }
    
}