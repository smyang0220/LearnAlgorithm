import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i<N; i++){
            String str = br.readLine();
            char[] arr = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            sb.append(arr[0]).append(arr[str.length()-1]);
            System.out.println(sb.toString());
        }
       
    }
}