import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/3048
// 개미
// 정렬알고리즘
// 처음에는 중앙인덱스끼리
// 그뒤엔 중앙 + 그 옆 인덱스끼리. 순서는 그옆 신참부터

public class Main {
    static StringTokenizer st;
    static BufferedReader br;
    static Character[] ants;
    static HashSet<Character> first;
    public static void main(String[] args) throws IOException{

        StringBuilder sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        first = new HashSet<Character>();

        int ant1 = Integer.parseInt(st.nextToken());
        int ant2 = Integer.parseInt(st.nextToken());

        String antName1 = br.readLine();
        String antName2 = br.readLine();

        int time = Integer.parseInt(br.readLine());


        ants = new Character[ant1+ant2];

        for(int i = 0; i < ant1; i++){
            ants[i] = antName1.charAt(ant1-i-1);
            first.add(ants[i]);
        }
        for(int i = ant1; i < ant1 + ant2; i++){
            ants[i] = antName2.charAt(i-ant1);
        }
        
        antSort(time);

        for(Character c : ants){
            sb.append(c);
        }

        System.out.println(sb.toString());

    }

    // 3,3 이라했을떄
    // 처음에는 배열 인덱스 2,3 을 섞는다.
    // 그뒤에는 12,34
    // 그 뒤에는 01, 23, 45
    // 6을 기준으로 햇을때 시작점이 6/2 - 1 이다.
    // 그다음은 6/2 - 2 가 시작점
    // 그다음은 6/2 -3 이 시작점.
    // public static void antSort(int T){
    //     int startPoint = ants.length/2;
    //     for(int i = 1 ; i <= T; i++){
    //         // 처음엔 한번
    //         // 그다음은 두번
    //         // 차례가 진행될떄마다 시작 지점을 1씩 줄여줘야한다.
    //         startPoint -= 1;
    //         int index = startPoint;
    //         for(int sortTime = 0; sortTime < i; sortTime++){
    //             // 여긴선 다음 함수 호출이 있기전 인덱스를 +2 해줘야한다.
    //             if(index >= 0 && index + 1 < ants.length) {
    //             antSort2(index);
    //             index+=2;
    //             }else{
    //                 index++;
    //             }
    //         }
    //     }
    // }

    // public static void antSort2(int start){
    //     if(first.contains(ants[start]) && !first.contains(ants[start+1])){
    //     char tmp = ants[start];
    //     ants[start] = ants[start+1];
    //     ants[start+1] = tmp;
    //     }
    // }

        public static void antSort(int T){
        int len = ants.length;
        for(int t = 0; t < T; t++){
            int i = 0;
            while(i < len - 1){
                // first가 첫 번째 그룹(Set), 두 번째 그룹이면 swap
                if(first.contains(ants[i]) && !first.contains(ants[i+1])){
                    char tmp = ants[i];
                    ants[i] = ants[i+1];
                    ants[i+1] = tmp;
                    i += 2;
                }else{
                    i++;
                }
            }
        }
}

}
