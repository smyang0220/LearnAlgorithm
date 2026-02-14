class Solution {
    public int[][] solution(int n) {
        int[][] arr = new int[n][n];
        for(int i = 0; i < arr.length; i++){
            arr[i][i] = 1;
        }
        return arr;
    }
}