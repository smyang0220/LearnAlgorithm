class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int num = left; num <= right; num++){
            if(check(num)){
                answer += num;
            } else {
                answer -= num;
            }
        }
        return answer;
    }

    public boolean check(int num){
        int count = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count++;
            }
        }
        return count % 2 == 0;
    }
}
