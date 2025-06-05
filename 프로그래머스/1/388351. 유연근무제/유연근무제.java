class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int n = schedules.length;

        for (int i = 0; i < n; i++) {
            int hopeTime = schedules[i];
            int limitTime = calTime(hopeTime);
            boolean isLate = false;

            for (int d = 0; d < 7; d++) {
                int dayOfWeek = (startday - 1 + d) % 7; // 0:월, ..., 5:토, 6:일
                
                // 토요일(5), 일요일(6)은 검사 안함
                if (dayOfWeek == 5 || dayOfWeek == 6) continue;

                int checkTime = timelogs[i][d]; // d는 이벤트 시작일부터 7일간 인덱스
                if (checkTime > limitTime) {
                    isLate = true;
                    break;
                }
            }

            if (!isLate) answer++;
        }
        return answer;
    }

    public int calTime(int time) {
        int hour = time / 100;
        int minute = time % 100;
        minute += 10;
        if (minute >= 60) {
            hour += 1;
            minute -= 60;
        }
        return hour * 100 + minute;
    }
}
