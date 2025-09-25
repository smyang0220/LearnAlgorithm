import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        while(true){
            str = br.readLine();
            if(str.equals("0")) break;
            String Rstr = new StringBuilder(str).reverse().toString();
            System.out.println(str.equals(Rstr) ? "yes" : "no");
        }
    }
}