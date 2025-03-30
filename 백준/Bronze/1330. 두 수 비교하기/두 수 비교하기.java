import java.util.*;
import java.io.*;

public class Main {
 
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int num1 = Integer.valueOf(st.nextToken());
        int num2 = Integer.valueOf(st.nextToken());
        
        if (num1 > num2){
            System.out.print(">");
        }else if(num1 < num2){
            System.out.print("<");
        }else{
            System.out.print("==");
        }
 
	}
 
}