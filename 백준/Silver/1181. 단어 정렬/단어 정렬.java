import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            if(!arr.contains(str)){
                arr.add(str);
            }
        }
         arr.sort(Comparator.comparingInt(String::length)
                                    .thenComparing(Comparator.naturalOrder()));

         for(String str : arr){
             System.out.println(str);
         }
        
    }
}