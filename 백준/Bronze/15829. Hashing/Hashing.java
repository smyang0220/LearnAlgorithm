import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        int poww = 31;
        int answer = arr[0] - 'a' + 1;
        for(int i = 1; i < N; i++){
            answer += (int)Math.pow(poww,i) * (arr[i]-'a'+1);
        }
        System.out.println(answer);
        
    }
}