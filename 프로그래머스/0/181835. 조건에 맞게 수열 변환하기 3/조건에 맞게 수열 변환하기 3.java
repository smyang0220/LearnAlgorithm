class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        for(int i = 0; i <answer.length; i++){
            answer[i] = fun(arr[i],k);
        }
        return answer;
    }
    
    public int fun(int m,int n){
        if(n%2==0){
            return m+n;
        }else{
            return m*n;
        }
    }
    
}