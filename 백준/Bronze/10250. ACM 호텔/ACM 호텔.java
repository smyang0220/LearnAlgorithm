import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int floor = Integer.parseInt(st.nextToken());
            int roomNum = Integer.parseInt(st.nextToken());
            int customer =  Integer.parseInt(st.nextToken());

            int answerF = customer % floor;
            if(answerF == 0) answerF = floor;

            int answerR = (customer - 1) / floor + 1;
            
            if(answerR < 10){
             System.out.println("" + answerF + "0" + answerR);
            }else{
             System.out.println("" + answerF + answerR);
            }
        }
    }
}