import java.util.*;

class Solution {
    
    // 각 유저는 한번에 한명의 유저 신고
    // 동일 유저 신고는 1회로 처리
    // k번 이상 신고되면 정지 사실을 신고한 사람들에게 메일
    // 취합해서 한번에 보냄
    
    // 메일을 받은 횟수
    
    private class ReportLog{
        String from;
        String to;
        
        ReportLog(String from, String to){
            this.from = from;
            this.to = to;
        }
        
        @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ReportLog rl = (ReportLog) obj;
        return from.equals(rl.from) && to.equals(rl.to);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }
    }
    
    public int[] solution(String[] id_list, String[] report, int k) {
        
        // 해시맵
        // 여기엔 뒤의 신고당한 사람과 횟수
        HashMap<String,Integer> map = new HashMap<>();
        
        // 여기엔 신고자와 신고대상의 정보를 Set로
        // 검사용
        HashSet<ReportLog> set = new HashSet<>();
        
        
        for(int i = 0; i< report.length; i++){
            String[] log = report[i].split(" ");
            ReportLog rl = new ReportLog(log[0],log[1]);
            if(set.contains(rl)){
                //System.out.println(rl.to + "이미 신고당함");
                continue;
            }
            set.add(rl);
            map.put(log[1], map.getOrDefault(log[1],0)+1);
            
        }
        
        ArrayList<String> list = new ArrayList<>();
        
        // 이제 k번 이상 신고된 사용자들을 판별하자
        for(Map.Entry<String,Integer> entrySet : map.entrySet()){
            if(entrySet.getValue() >= k){
                list.add(entrySet.getKey());
               // System.out.println("k번이상 신고당함" + entrySet.getKey());
            }
        }
        
        int index = 0;
        int[] answer = new int[id_list.length];
       
        // 이제 answer에서 자신이 신고한 사람이 나오면 +1 씩 해주어야하는데
        
        HashMap<String, Integer> idIndex = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            idIndex.put(id_list[i], i);
        }

        // set에 저장된 신고 정보를 활용해서
        for (ReportLog rl : set) {
            // rl.to가 정지자 list에 있는지 확인
            if (list.contains(rl.to)) {
                // rl.from의 answer +1
                int idx = idIndex.get(rl.from);
                answer[idx]++;
            }
        }

        return answer;

    }
}