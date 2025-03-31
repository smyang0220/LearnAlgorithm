import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // 낮에 올라가는 높이
        int B = Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 높이
        int V = Integer.parseInt(st.nextToken()); // 나무 막대 높이
        
        int diff = A - B; // 하루에 실제로 올라가는 높이
        int remainHeight = V - A; // 마지막 날 전까지 올라가야 하는 높이
        
        if (A >= V) { 
            // 첫날에 바로 도달하는 경우
            System.out.print(1);
        } else {
            // 나머지 높이를 계산할 때 올림 처리 필요
            // 나누어 떨어지지 않으면 하루를 더 추가
            int days = (remainHeight % diff == 0) ? (remainHeight / diff) : (remainHeight / diff + 1);
            System.out.print(days + 1); // 마지막 날 추가
        }
    }
}