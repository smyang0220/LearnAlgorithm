import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int[] dp;
	public static int[] stair;
public static void main(String[] args) throws NumberFormatException, IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int Tc = Integer.parseInt(br.readLine());
	dp = new int[Tc+3];
	stair = new int[Tc+3];
	
	for(int i = 0; i < stair.length; i++) {
		stair[i] = 1;
	}
	for(int test = 1; test <= Tc; test++) {
		stair[test] = Integer.parseInt(br.readLine());		
	}
	dp[1] = stair[1];
	
	dp[2] = stair[1] + stair[2];	
	
	dp[3] = Math.max(stair[1]+stair[3], stair[2]+stair[3]);
	

	
	System.out.println(func(Tc));
	
}

public static int func(int N) {
	if(N > 3 &&dp[N]==0) {		
		dp[N] =  Math.max(func(N - 2), func(N - 3) + stair[N - 1]) + stair[N];
	}
	
	return dp[N];
	
	
}



}
