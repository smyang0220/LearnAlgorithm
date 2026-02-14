class Solution {
    public int solution(String number) {
        
        String[] arr = number.split("");
        int N = 0;
        for(int i = 0; i < arr.length; i++){
            N += Integer.parseInt(arr[i]);
        }
        
        return N % 9;
    }
}