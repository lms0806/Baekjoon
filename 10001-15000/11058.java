import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		long[] dp = new long[n + 1];
		
		for(int i = 1; i <= n; i++) {
			dp[i] = dp[i - 1] + 1;
			
			for(int j = 3; j < i; j++) {
				dp[i] = Math.max(dp[i], dp[i - j] * (j - 1));
			}
		}
		System.out.print(dp[n]);
	}
}
