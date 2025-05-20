

import java.io.*;
import java.util.*;

// 문제
/* https://www.acmicpc.net/problem/10451
 *1부터 N까지 정수 N개로 이루어진 순열을 나타내는 방법은 여러 가지가 있다. 예를 들어, 8개의 수로 이루어진 순열 (3, 2, 7, 8, 1, 4, 5, 6)을 배열을 이용해 표현하면  
 
\(\begin{pmatrix} 1 & 2 &3&4&5&6&7&8 \\  3& 2&7&8&1&4&5&6 \end{pmatrix}\) 와 같다. 또는, Figure 1과 같이 방향 그래프로 나타낼 수도 있다.

순열을 배열을 이용해  
 
\(\begin{pmatrix} 1 & \dots & i & \dots &n \\  \pi_1& \dots& \pi_i & \dots & \pi_n \end{pmatrix}\) 로 나타냈다면, i에서 πi로 간선을 이어 그래프로 만들 수 있다.

Figure 1에 나와있는 것 처럼, 순열 그래프 (3, 2, 7, 8, 1, 4, 5, 6) 에는 총 3개의 사이클이 있다. 이러한 사이클을 "순열 사이클" 이라고 한다.

N개의 정수로 이루어진 순열이 주어졌을 때, 순열 사이클의 개수를 구하는 프로그램을 작성하시오.
 */

 /*
  * 입력
  첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스의 첫째 줄에는 순열의 크기 N (2 ≤ N ≤ 1,000)이 주어진다. 둘째 줄에는 순열이 주어지며, 각 정수는 공백으로 구분되어 있다.
  */

public class Main {

    static int N,M,V;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    static int[][] arr;
    static Queue<Integer> q = new LinkedList<>();
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(bf.readLine());

        for(int i = 0; i<count; i++){
            bfs();
        }
        System.out.println(sb);
    }

    public static void bfs() throws IOException{
        int permutation = 0;
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N+1];
        boolean[] flag = new boolean[N+1];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 1; i<=N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i =1; i<=N; i++){
            if(!flag[i]){
                permutation++;
                q.add(i);
                while(!q.isEmpty()){
                            int num = q.poll();
                            if(!flag[num]){ // 방문한적없으면
                                q.add(arr[num]);
                                flag[num] = true;
                            }
                        }
            }
        }
        sb.append(permutation + "\n");
    }

}
