import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[size+1];
        
        for(int i =1; i<size+1; i++){
            arr[i] = i;
        }
        
        for(int k = 0; k<count; k++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            while(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < size+1; i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.print(sb.toString());
       
    }
}
