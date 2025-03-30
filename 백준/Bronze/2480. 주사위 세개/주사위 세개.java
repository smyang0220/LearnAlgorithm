import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[7];
        int max = 1;
        while(st.hasMoreTokens()){
            int index = Integer.parseInt(st.nextToken());
            arr[index] += 1;
            if (arr[index] >= max){
                max = arr[index];
            }
        }
                                               
        if(max == 1){
            for(int i=6;i>0;i--){
                if (arr[i] == 1){
                    System.out.print(100*i);
                      break;
                }
            }
        }else if(max == 2){
            for(int i=6;i>0;i--){
                if (arr[i] == 2){
                    System.out.print(1000+100*i);
                      break;
                }
            }
        }else{
            for(int i=6;i>0;i--){
                if (arr[i] == 3){
                    System.out.print(10000+1000*i);
                    break;
                }
            }
        }
                                                
    }
}