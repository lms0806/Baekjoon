import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static long mod = 1000000009;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		long[][] dp = new long[100001][2];
		
		dp[1][0] = 1;
		
		dp[2][0] = dp[2][1] = 1;
		
		dp[3][0] = dp[3][1] = 2;
		
		for(int i = 4; i < dp.length; i++) {
			dp[i][0] = (dp[i - 1][1] + dp[i - 2][1] + dp[i - 3][1]) % mod;
			dp[i][1] = (dp[i - 1][0] + dp[i - 2][0] + dp[i - 3][0]) % mod;
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int num = Integer.parseInt(br.readLine());
			
			sb.append(dp[num][0]).append(" ").append(dp[num][1]).append("\n");
		}
		System.out.print(sb);
	}
}
