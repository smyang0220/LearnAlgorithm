import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] time = new int[2];     
        int index = 0;             
        while(st.hasMoreTokens()){
            time[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        
        if(time[1] > 44){
            System.out.printf("%d %d",time[0],time[1]-45);
        }else{
            System.out.printf("%d %d",(time[0]+23)%24,15+time[1]);
        }
       
    }
}