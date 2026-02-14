class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        int n = board.length;  // 행(열) 개수
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k) {       // 핵심 조건[web:91][web:94]
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }
}
