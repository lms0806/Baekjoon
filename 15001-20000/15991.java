import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static long mod = 1000000009;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		long[] dp = new long[100001];
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 2;
		dp[4] = 3;
		dp[5] = 3;
		dp[6] = 6;
		
		for(int i = 7; i < dp.length; i++) {
			dp[i] = (dp[i - 2] + dp[i - 4] + dp[i - 6]) % mod;
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			sb.append(dp[Integer.parseInt(br.readLine())]).append("\n");
		}
		System.out.print(sb);
	}
}
