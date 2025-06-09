import java.util.*;

class Report {
    String a;
    String b;
    
    public Report(String a, String b){
        this.a = a;
        this.b = b;
    }

    // HashSet에서 중복 제거를 위해 equals/hashCode 반드시 필요!
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Report report = (Report) o;
        return a.equals(report.a) && b.equals(report.b);
    }
    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        HashSet<Report> set = new HashSet<>();
        // 신고당한 횟수 카운트
        HashMap<String,Integer> reportedCount = new HashMap<>();
        // 메일 발송 횟수 카운트
        HashMap<String,Integer> mailCount = new HashMap<>();
        
        int[] answer = new int[id_list.length];
        
        // 1. 신고 내역 중복 제거
        for(String str : report){
            String[] who = str.split(" ");
            set.add(new Report(who[0],who[1]));
        }
        
        // 2. 각 유저가 신고당한 횟수 카운트
        for(Report rep : set){
            reportedCount.put(rep.b, reportedCount.getOrDefault(rep.b,0) + 1);
        }
        
        // 3. 정지된 유저를 신고한 사람에게 메일 발송 횟수 카운트
        for(Report rep : set){
            // 신고당한 사람이 k번 이상 신고당하면
            if(reportedCount.get(rep.b) >= k){
                // 신고한 사람에게 메일 +1
                mailCount.put(rep.a, mailCount.getOrDefault(rep.a,0) + 1);
            }
        }

        // 4. id_list 순서대로 결과 배열 채우기
        for(int i = 0; i < id_list.length; i++){
            answer[i] = mailCount.getOrDefault(id_list[i], 0);
        }
        
        return answer;
    }
}
