import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[15][14];
        arr[0] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        // for (int j = 0; j < 14; j++) arr[0][j] = j + 1;
        for(int i = 1; i < 15; i++){
            arr[i][0] = 1;
            for(int j = 1; j < 14; j++){
                arr[i][j] = arr[i][j-1] + arr[i-1][j];
            }
        }
        for(int i = 0; i < N; i++){
            int floor = Integer.parseInt(br.readLine());
            int ho = Integer.parseInt(br.readLine());
            System.out.println(arr[floor][ho-1]);
        }
    }
}

// 1,4,10
// 1,3,6,10
// 1,2,3,4,5,6