import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long mod = 1000000007;
		long[][] dp = new long[n][5];

		Arrays.fill(dp[0], 1);
		
		// 1, 2, 3, 4
		for(int i = 1; i < n; i++) {
			dp[i][0] = (dp[i - 1][1] + dp[i - 1][2] + dp[i - 1][3] + dp[i - 1][4]) % mod;
			dp[i][1] = (dp[i - 1][0] + dp[i - 1][3] + dp[i - 1][4]) % mod;
			dp[i][2] = (dp[i - 1][0] + dp[i - 1][4]) % mod;
			dp[i][3] = (dp[i - 1][0] + dp[i - 1][1]) % mod;
			dp[i][4] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % mod;
		}
		
		long answer = 0;
		for(int i = 0; i < 5; i++) {
			answer = (answer + dp[n - 1][i]) % mod;
		}
		System.out.print(answer);
	}
}
