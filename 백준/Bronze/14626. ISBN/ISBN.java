import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        //9,21,8,24,9,18,8,9,2,6,*1,21
        //38,33,35,29
        //71,64
        //10 - (135 + *) % 10 = 3
        int num = 0;
        int pow = 0;
        int m = 10 - (arr[12] - '0');

        // (num + pow * answer) % 10 = m;
        
        for(int i = 0; i < 12; i++){
            if(arr[i] - '0' > 10 || arr[i] -'0' < 0){
                if((i+2) % 2 == 0){
                    pow = 1;
                } else{
                    pow = 3;
                }
                continue;
            }
            if((i+2) % 2 == 0){
                num += arr[i] - '0';
            } else{
                num += (arr[i] - '0') * 3;
            }
        }

        if(m == 10){
            for(int i = 0; i<10; i++){
                if((num + (pow * i)) % 10 == 0){
                System.out.println(i);
                return;
                }
            }
        }else{
            for(int i = 0; i<10; i++){
            if( (num + (pow * i)) % 10 == m ){
                System.out.println(i);
                return;
            }
        }
        }
        
        
    }
}