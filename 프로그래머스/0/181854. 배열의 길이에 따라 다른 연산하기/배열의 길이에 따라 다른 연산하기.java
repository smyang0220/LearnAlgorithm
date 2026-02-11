class Solution {
    public int[] solution(int[] arr, int n) {
        if(arr.length%2 == 0){
            return couple(arr,n);
        }else{
            return single(arr,n);
        }
    }
    
    public int[] single(int[] arr, int n){
        int[] answer = new int[arr.length];
        for(int i=0; i<answer.length; i++){
            if(i%2==0){
                answer[i] = arr[i]+n;
            }else{
                answer[i] = arr[i];
                continue;
            }
        }
        return answer;
    }
    
    public int[] couple(int[] arr, int n){
        int[] answer = new int[arr.length];
        for(int i=0; i<answer.length; i++){
            if(i%2!=0){
                answer[i] = arr[i]+n;
            }else{
                answer[i] = arr[i];
                continue;
            }
        }
        return answer;
    }
}