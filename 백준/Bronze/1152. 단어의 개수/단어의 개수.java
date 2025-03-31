import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = 0;
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            num++;
        }
        System.out.print(num);
    }
}