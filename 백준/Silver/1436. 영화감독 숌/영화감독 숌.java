import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        //666,1666,6661,11666,16661,66611,111666,116661,166611,666111,1111666,1116661,1166611,1666111,6661111
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 9, 9, 9*9, 9*9, 9*9, 9*9*9, ~~~~~

        int cnt = 0;
        int num = 0;
        while(cnt!=N){
            num++;
            if(Integer.toString(num).contains("666")) cnt++;
        }

        System.out.println(num);
        
        
    }
}