import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        
        // 테스트케이스 검증
        for(int c = 0; c < N; c++){
            int[] num = new int[26];
            char[] arr = br.readLine().toCharArray();
            char currentAlp = arr[0];
            num[currentAlp-'a'] += 1;
            for(int i = 1; i<arr.length; i++){
                if(arr[i] == arr[i-1]){
                    continue;
                }
                currentAlp = arr[i];
                num[currentAlp-'a'] += 1;
            }
            int max = Arrays.stream(num).max().orElse(0);
            if(max == 1){
                answer++;
            }
        }
        System.out.print(answer);
       
    }
}