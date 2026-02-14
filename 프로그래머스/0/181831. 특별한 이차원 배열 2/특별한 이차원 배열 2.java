class Solution {
    public int solution(int[][] arr) {
        int N = arr[0].length;
        for(int i = 0; i <N; i++){
            for(int j = 0; j<N; j++){
                if(i == j) continue;
                if(arr[i][j] != arr[j][i]) return 0;
            }
        }
        return 1;
    }
}