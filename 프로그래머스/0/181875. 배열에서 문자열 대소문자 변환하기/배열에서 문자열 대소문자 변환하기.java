class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i = 0; i < answer.length; i++){
            if(i % 2 == 0){
                answer[i] = strArr[i].toLowerCase();  // 소문자 변환
            } else {
                answer[i] = strArr[i].toUpperCase();  // 대문자 변환
            }
        }
        return answer;
    }
}
