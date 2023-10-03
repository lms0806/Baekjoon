import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static long mod = 1000000009;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		long[][] dp = new long[100001][4];
		
		dp[1][1] = dp[2][2] = dp[3][1] = dp[3][2] = dp[3][3] = 1;
		
		for(int i = 4; i < dp.length; i++) {
			dp[i][1] = (dp[i - 1][2] + dp[i - 1][3]) % mod;
			dp[i][2] = (dp[i - 2][1] + dp[i - 2][3]) % mod;
			dp[i][3] = (dp[i - 3][1] + dp[i - 3][2]) % mod;
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int num = Integer.parseInt(br.readLine());
			
			sb.append((dp[num][1] + dp[num][2] + dp[num][3]) % mod).append("\n");
		}
		System.out.print(sb);
	}
}
