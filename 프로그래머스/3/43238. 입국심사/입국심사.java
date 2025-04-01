import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        // 가능한 최소 시간과 최대 시간 설정
        long min = 1;
        long max = (long) times[0] * n; // 가장 긴 심사대에서 모든 사람이 심사받는 경우
        
        // 최댓값 계산
        for (int time : times) {
            max = Math.max(max, (long) time * n);
        }
        
        // 이진 탐색 수행
        long answer = max;
        while (min <= max) {
            long mid = (min + max) / 2;
            
            // mid 시간 동안 처리할 수 있는 사람 수 계산
            long sum = 0;
            for (int time : times) {
                sum += mid / time;
                
                // n명을 초과하면 더 계산할 필요 없음
                if (sum >= n) {
                    break;
                }
            }
            
            // mid 시간 동안 n명 이상 처리 가능한 경우
            if (sum >= n) {
                answer = Math.min(answer, mid);
                max = mid - 1;
            } else { // mid 시간으로는 n명을 처리할 수 없는 경우
                min = mid + 1;
            }
        }
        
        return answer;
    }
}