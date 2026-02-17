class Solution {
    public int[] solution(long n) {
        String num = Long.toString(n);
        char[] numbers = num.toCharArray();
        int[] answer = new int[numbers.length];
        int index = 0;
        for(int i = numbers.length-1 ; i >= 0; i--){
            answer[index++] = numbers[i] - '0';
        }
        return answer;
    }
}