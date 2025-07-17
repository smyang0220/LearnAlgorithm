
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2884
// 알람시계
// 45분 일찍 알람을 맞추면 된다.

public class Main {
    public static void main(String[] args) throws IOException{

        int hour = 0;
        int minute = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        StringTokenizer st = new StringTokenizer(br.readLine());

        hour = Integer.parseInt(st.nextToken());
        minute = Integer.parseInt(st.nextToken());

        setAlram(hour, minute);
        
    }

    public static void setAlram(int hour, int minute){

        int[] answer = new int[2];

        if(minute<45){
            answer[1] = minute + 15;
            hour -= 1;
        }else{
            answer[1] = minute - 45;
        }

        if(hour < 0 ){
            answer[0] = 23;
        }else{
            answer[0] = hour;
        }

        System.out.printf("%d %d",answer[0],answer[1]);
    }
}
