import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        if(first > second){
            descending(st,second);    
        }else{
            ascending(st,second);
        }
        
    }

    static void descending(StringTokenizer st, int num){
        int tmp = num;
        while(st.hasMoreTokens()){
            int current = Integer.parseInt(st.nextToken());
            if(tmp < current){
                System.out.println("mixed");
                return;
            }
            tmp = current;
        }
        System.out.println("descending");
    }

     static void ascending(StringTokenizer st, int num){
        int tmp = num;
        while(st.hasMoreTokens()){
            int current = Integer.parseInt(st.nextToken());
            if(tmp > current){
                System.out.println("mixed");
                return;
            }
            tmp = current;
        }
        System.out.println("ascending");
    }


   
}