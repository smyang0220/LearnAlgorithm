import java.util.*;

public class Main {
    static int N, M;
    static int[] arr;    // 입력받은 원본 배열
    static int[] result;  // 결과 배열
    static boolean[] visited;  // 방문 체크 배열
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();  // 전체 숫자 개수
        M = sc.nextInt();  // 선택할 숫자 개수
        
        arr = new int[N];
        result = new int[M];
        visited = new boolean[N];
        
        // 숫자 입력 받기
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 정렬 (같은 숫자가 연속해서 나오도록)
        Arrays.sort(arr);
        
        // 백트래킹으로 순열 생성
        permutation(0);
        
        // 결과 출력
        System.out.print(sb.toString());
        
        sc.close();
    }
    
    // 같은 것이 있는 순열 생성 함수
    static void permutation(int depth) {
        // M개를 모두 선택했으면 결과 저장
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        int prev = -1;  // 이전에 선택한 값 (같은 위치에서 중복 선택 방지)
        
        for (int i = 0; i < N; i++) {
            // 이미 선택한 인덱스면 건너뛰기
            if (visited[i]) continue;
            
            // 같은 레벨에서 같은 숫자가 이미 선택되었으면 스킵
            if (prev == arr[i]) continue;
            
            // 같은 숫자가 연속으로 나올 때 앞의 숫자가 선택되지 않았으면 스킵
            if (i > 0 && arr[i] == arr[i-1] && !visited[i-1]) continue;
            
            visited[i] = true;
            result[depth] = arr[i];
            prev = arr[i];  // 현재 선택한 값 저장
            
            permutation(depth + 1);
            
            visited[i] = false;
        }
    }
}