import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long[][] dp = new long[n + 1][10];
		
		Arrays.fill(dp[1], 1);
		dp[1][0] = 0;
		
		long mod = 1000000000;
		for(int i = 2; i <= n; i++) {
			for(int j = 0; j < 10; j++) {
				if(j == 0) {
					dp[i][j] = dp[i - 1][j + 1] % mod;
				}
				else if(j == 9) {
					dp[i][j] = dp[i - 1][j - 1] % mod;
				}
				else {
					dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % mod;
				}
			}
		}
		
		long sum = 0;
		for(int i = 0; i < 10; i++) {
			sum = (sum + dp[n][i]) % mod;
		}
		System.out.print(sum);
	}
}
