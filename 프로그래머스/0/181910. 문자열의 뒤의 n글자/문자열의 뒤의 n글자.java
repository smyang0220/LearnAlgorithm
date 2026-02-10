class Solution {
    public String solution(String my_string, int n) {
        int N = my_string.length();
        String answer =  my_string.substring(N-n);
        return answer;
    }
}