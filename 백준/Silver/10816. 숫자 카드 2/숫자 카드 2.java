import java.util.*;
import java.io.*;

public class Main {
    
    // 첫번째
    static int findFirstIndex(int num){
        int l = 0;
        int r = arr.length;
        int m;
        while(l<r){
            m = (l+r) / 2;
            if (num <= arr[m]){
                r = m;
            }else{
                l = m + 1;
            }
        }
        return l;
    }
    
    // 마지막
    static int findLastIndex(int num){
        int l = 0;
        int r = arr.length;
        int m;
        while(l<r){
            m = (l+r) / 2;
            if (num < arr[m]){
                r = m;
            }else{
                l = m + 1;
            }
        }
        return l;
    }
    
    static int[] arr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        arr = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int index = 0;
        while(st.hasMoreTokens()){
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        Arrays.sort(arr);
        
        int size2 = Integer.parseInt(br.readLine());
        int[] arr2 = new int[size2];
        
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            sb.append(findLastIndex(num)-findFirstIndex(num)).append(" ");
        }
        
        System.out.print(sb.toString());
       
    }
}