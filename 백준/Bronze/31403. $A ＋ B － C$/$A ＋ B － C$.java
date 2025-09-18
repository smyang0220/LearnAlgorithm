import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sa = br.readLine();
        String sb = br.readLine();
        String sc = br.readLine();

        int A = Integer.parseInt(sa);
        int B = Integer.parseInt(sb);
        int C = Integer.parseInt(sc);

        // 첫 번째 출력: 수로 연산한 A + B - C
        System.out.println(A + B - C);
        
        // 두 번째 출력: 문자열 연결 후 정수 변환 (A, B 문자열 연결) - C 값
        String combined = sa + sb;
        int combinedNum = Integer.parseInt(combined);
        System.out.println(combinedNum - C);
    }
}
