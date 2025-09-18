import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A,B,C,D;
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());
        D = A*B*C;
        int[] nums = new int[10];
        char[] chaArr = Integer.toString(D).toCharArray();
        for(int i = 0; i < chaArr.length; i++){
            nums[chaArr[i] - '0']++;
        }

        for(int num : nums){
            System.out.println(num);
        }
    }
}