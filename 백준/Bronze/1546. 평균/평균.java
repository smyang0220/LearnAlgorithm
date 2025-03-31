import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        int index = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        
        // 최댓값 찾기
        int max = Arrays.stream(arr).max().getAsInt();
        
        // 점수 조작 및 평균 계산
        double sum = 0;
        for(int i = 0; i < size; i++) {
            sum += (double)arr[i] / max * 100;
        }
        
        double average = sum / size;
        System.out.println(average);
    }
}