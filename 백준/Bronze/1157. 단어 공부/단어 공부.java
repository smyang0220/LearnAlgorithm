import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int[] count = new int[26];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] >= 'a'){
                count[arr[i]-'a'] += 1;
            }else{
                count[arr[i]-'A'] += 1;
            }
        }
        
        int max = Arrays.stream(count).max().orElse(0);
        int M = 0;
        int index = 0;
        for(int i = 0; i<26; i++){
            if(count[i]==max){
                M++;
                index = i;
            }
        }
        if(M >1){
            System.out.print("?");
        }else{
            System.out.print((char)(index+'A'));
        }
    }
}