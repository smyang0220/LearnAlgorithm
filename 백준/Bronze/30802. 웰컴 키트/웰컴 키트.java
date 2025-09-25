import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[6];
        int index = 0;
        while(st.hasMoreTokens()){
           arr[index++] = Integer.parseInt(st.nextToken()); 
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int needT = 0;
        for(Integer t : arr){
            if(t==0) continue;
            needT += (t-1)/T + 1;
        }

        System.out.println(needT);
        System.out.printf("%d %d",N/P,N%P);
    }
}