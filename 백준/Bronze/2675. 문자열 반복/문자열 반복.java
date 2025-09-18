import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int t = 0; t < N; t++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String answer = "";
            int num = Integer.parseInt(st.nextToken());
            char[] strArr = st.nextToken().toCharArray();
            for(Character c : strArr){
                for(int i = 0; i < num; i++){
                    answer += c;    
                }
            }
            System.out.println(answer);
        }
    }
}