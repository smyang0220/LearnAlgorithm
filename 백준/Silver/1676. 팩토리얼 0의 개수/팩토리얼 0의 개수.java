import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 각 수를 5로 나누엇을때 딱 맞게 떨어지는지
        // 그리고 25의 경우 5가 두번이기에 맞아 떨어지면 5로 나눈뒤 다시 딱맞게 되는지
        int answer = 0;
        for(int i = 5; i <=N; i++){
            int M = i;
            while(M!=0){
                if(M%5 == 0){
                    answer++;
                    M = M/5;
                }else{
                    M = 0;
                } 
            }
        }
        System.out.println(answer);
    }
}