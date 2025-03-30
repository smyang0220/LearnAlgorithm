import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cost = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        for(int i=0;i<count;i++){
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            cost -= Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
            
        }
        if (cost == 0){
            System.out.print("Yes");
        }else{
           System.out.print("No"); 
        }
       
    }
}