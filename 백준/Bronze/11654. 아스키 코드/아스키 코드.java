import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 문자열의 첫 번째 문자를 가져와서 정수로 변환
        char input = br.readLine().charAt(0);
        System.out.print((int)input);
    }
}