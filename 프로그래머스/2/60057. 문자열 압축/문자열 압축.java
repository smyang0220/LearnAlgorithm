import java.util.*;

class Solution {
    
    // 문자열 나눈 리스트 반환 함수
    private List<String> devide(String str, int length){
        List<String> arr = new ArrayList<>();
        for(int i = 0; i < str.length(); i+=length){
            int lastIndex = i+length;
            if(lastIndex > str.length()) lastIndex = str.length();
            arr.add(str.substring(i,lastIndex));
        }
        return arr;
    }
    
    private int calcLength(String str, int length){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        String lastWord = "";
        for(String letter : devide(str,length)){
            // 끝 문자와 현재 문자가 같으면
            // count++
            if(letter.equals(lastWord)){
                count++;
            }else{
                if(count > 1) sb.append(count);
                sb.append(lastWord);
                lastWord = letter;
                count = 1;                
            }
        }
        
        if(count > 1) sb.append(count);
        sb.append(lastWord);
        
        return sb.length();
    }
    
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        for(int length = 1; length <= s.length(); length++){
            int num = calcLength(s, length);
            if(answer > num) answer = num;
        }
        return answer;
    }
}