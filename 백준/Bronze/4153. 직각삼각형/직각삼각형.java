import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            if (arr[0]==0) break;
            if(arr[2]*arr[2] == arr[1]*arr[1] + arr[0]*arr[0]){
                System.out.println("right");
            }else{
                 System.out.println("wrong");
            }
        }
       
    }
}