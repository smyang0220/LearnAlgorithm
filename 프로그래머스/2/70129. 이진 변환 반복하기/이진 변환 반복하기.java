class Solution {
    public int[] solution(String s) {
        int T = 0; 
        int remove = 0;
        String str = s;
        while(!str.equals("1")){
            StringBuilder sb = new StringBuilder();
            int zero = 0;
            for(char c : str.toCharArray()){
                if(c == '0'){
                    zero++;
                }else{
                    sb.append(1);      
                }
            }
            
            remove += zero;
            str = Integer.toString((str.length() - zero),2);
            
            
            
            T++;
        }
        int[] answer = new int[] {T,remove};
        return answer;
    }
}