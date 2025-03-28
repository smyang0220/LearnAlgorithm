import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        char[] chr = a.toCharArray();
        for(int i = 0; i < chr.length; i++){
            if (Character.isUpperCase(chr[i])) answer += Character.toLowerCase(chr[i]);
            else answer += Character.toUpperCase(chr[i]);
                
        }
        System.out.print(answer);
    }
}