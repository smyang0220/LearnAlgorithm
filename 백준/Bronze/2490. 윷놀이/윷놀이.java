import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for(int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int num = 0;

            while(st.hasMoreTokens()){
                num += Integer.parseInt(st.nextToken());
            }
            System.out.println(traditionalPlay(num));
        }
        
    }

    public static Character traditionalPlay(int num){
        switch(num){
            case 0 :
                return 'D';
            case 1 : 
                return 'C';
            case 2 :
                return 'B';
            case 3 :
                return 'A';
            case 4 :
                return 'E';
            default :
                return 'T';
        }
    }
}
