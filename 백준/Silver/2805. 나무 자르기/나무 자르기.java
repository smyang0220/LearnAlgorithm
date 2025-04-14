import java.util.*;
import java.io.*;

public class Main {
    
    static int binarySearch(int[] arr,int size,int target){
        int pl = 0;
        int pr = Arrays.stream(arr).max().orElse(0);
        int answer = 0;
        
        while(pl<=pr){
            int pc = (pl + pr) / 2;
            long wood = 0;
            
            for (int tree : arr) {
                if (tree > pc) {
                    wood += tree - pc;
                }
            }
            
            if (wood >= target){
                answer = pc;
                pl = pc + 1;
            }else{
                pr = pc - 1;
            }
        }
        
        return answer;
    }
    
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int size = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[size];
        
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < size; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int answer = binarySearch(arr,size,target);
        System.out.print(answer);
        
    }
}