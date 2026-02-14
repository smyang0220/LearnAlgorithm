import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] arr = my_string.split("");
        String[] answer = new String[my_string.length()];
        int index = 0;
        answer[index] = arr[arr.length-1];
        for(int i = arr.length-2; i >=0; i--){
            index++;
            answer[index] =  arr[i] + answer[index-1];
        }
        Arrays.sort(answer);
        return answer;
    }
}