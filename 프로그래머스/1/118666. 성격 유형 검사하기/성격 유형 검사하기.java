import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();

        // 성격 유형 쌍 정의
        char[][] mbti = {
            {'R', 'T'},
            {'C', 'F'},
            {'J', 'M'},
            {'A', 'N'}
        };

        // 점수 분배
        for(int i = 0; i < choices.length; i++) {
            char disagree = survey[i].charAt(0);
            char agree = survey[i].charAt(1);
            int choice = choices[i];

            if (choice < 4) { // 비동의 쪽에 점수
                map.put(disagree, map.getOrDefault(disagree, 0) + (4 - choice));
            } else if (choice > 4) { // 동의 쪽에 점수
                map.put(agree, map.getOrDefault(agree, 0) + (choice - 4));
            }
            // choice == 4는 점수 없음
        }

        // 각 지표에서 점수 비교
        for(int i = 0; i < 4; i++) {
            char type1 = mbti[i][0];
            char type2 = mbti[i][1];
            int score1 = map.getOrDefault(type1, 0);
            int score2 = map.getOrDefault(type2, 0);

            if (score1 >= score2) {
                sb.append(type1);
            } else {
                sb.append(type2);
            }
        }

        return sb.toString();
    }
}
