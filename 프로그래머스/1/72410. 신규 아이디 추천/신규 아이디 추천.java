class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        // 모든 대문자를 소문자로
        String step1 = new_id.toLowerCase();
        
        // 알파벳,숫자,-,_,. 을 제외하고 모두 제거
        char[] step1_arr = step1.toCharArray();
        StringBuilder step2 = new StringBuilder();
        for(char c : step1_arr){
            if(( c >= 'a' && c <= 'z') || c >= '0' && c <= '9' || c == '-' || c == '_' || c == '.'){
                step2.append(c);
            }
        }
        
        // 마침표가 2번이상 연속된 부분을 하나의 마침표로 치환
        String step3 = step2.toString();
        while(step3.contains("..")){
            step3 = step3.replace("..",".");
        }
        
        // 마침표가 처음이나 끝에 위치하면 제거
        String step4 = step3;
        if (step4.length() > 0) {
            if (step4.charAt(0) == '.') {
                step4 = step4.substring(1, step4.length());
            }
        }
        if (step4.length() > 0) {
            if (step4.charAt(step4.length() - 1) == '.') {
                step4 = step4.substring(0, step4.length() - 1);
            }
        }
        
        // 빈문자열이라면 a를 대입한다
        if(step4.equals("")){
            step4 = "a";
        }
        
        // 16자 이상이라면 15까지는 모두 제거
        // 제거 후 마침표가 끝에 위치한다면 끝에 위치한 마침표 제거
        if(step4.length()>=16){
            step4 = step4.substring(0,15);
            if(step4.charAt(step4.length() - 1) == '.'){
                step4 = step4.substring(0, step4.length() - 1);
            }
        }
        
        // 2자 이하라면 마지막 문자를 길이가 3이될때까지 더함
        
        StringBuilder step7 = new StringBuilder(step4);
        if (step7.length() <= 2) {
            char last = step7.charAt(step7.length() - 1);

            while (step7.length() < 3) {
                step7.append(last);
            }
        }
        
        
        
        return step7.toString();
    }
}