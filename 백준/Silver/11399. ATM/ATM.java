import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int size = Integer.parseInt(br.readLine());
	int[] arr = new int[size];
	StringTokenizer st = new StringTokenizer(br.readLine());
	for(int i = 0; i<arr.length;i++) {
		arr[i] = Integer.parseInt(st.nextToken());
	}
	Arrays.sort(arr);
	int[] sum = new int[size];
	sum[0] = arr[0];
	for(int i = 1; i<arr.length;i++) {
		sum[i] = sum[i-1]+arr[i];
	}
	int result= 0;
	for(int i = 0; i<arr.length; i++) {
		result += sum[i];
	}
	System.out.println(result);
	
}
}
