class Solution {
    public int solution(int[][] triangle) {
        int size = triangle.length;
        int[][] copy = new int[size][size];

        // 시작점 초기화
        copy[0][0] = triangle[0][0];

        // DP로 최대값 저장
        for (int i = 1; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    // 맨 왼쪽: 위에서만 내려올 수 있음
                    copy[i][j] = copy[i-1][j] + triangle[i][j];
                } else if (j == i) {
                    // 맨 오른쪽: 왼쪽 위에서만 내려올 수 있음
                    copy[i][j] = copy[i-1][j-1] + triangle[i][j];
                } else {
                    // 가운데: 두 방향 중 큰 값 선택
                    copy[i][j] = Math.max(copy[i-1][j-1], copy[i-1][j]) + triangle[i][j];
                }
            }
        }

        // 마지막 줄에서 가장 큰 값이 정답
        int answer = 0;
        for (int i = 0; i < size; i++) {
            answer = Math.max(answer, copy[size-1][i]);
        }

        return answer;
    }
}
