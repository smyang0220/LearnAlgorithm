import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        // 최댓값 구하기
        int max = Arrays.stream(arr).max().orElse(0);
        
        int maxIndex = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == max) {
                maxIndex = i;
                break;
            }
        }
        
        System.out.println(max);
        System.out.println(maxIndex + 1);
    }
}