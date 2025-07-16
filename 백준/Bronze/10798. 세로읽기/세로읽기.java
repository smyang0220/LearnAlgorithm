import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] len = new int[5];
        String[] arr = new String[5];
        int max = 0;
       
        for(int i = 0; i <5; i++){
            String str = br.readLine();
            len[i] = str.length();
            if(max < len[i]){
                max = len[i];
            }
            arr[i] = str;
        }

        for(int i = 0; i < max; i++){
            for(int j = 0; j<5; j++){
                if(len[j] > i){
                    sb.append(arr[j].charAt(i));
                }
            }
        }

        System.out.println(sb.toString());


    }
}
