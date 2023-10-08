import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n + 1];
		
		for(int i = 1; i <= n; i++) {
			dp[i] = dp[i - 1] + 1;
			
			if(i >= 2) {
				dp[i] = Math.min(dp[i], dp[i - 2] + 1);
			}
			if(i >= 5) {
				dp[i] = Math.min(dp[i], dp[i - 5] + 1);
			}
			if(i >= 7) {
				dp[i] = Math.min(dp[i], dp[i - 7] + 1);
			}
		}
		
		System.out.print(dp[n]);
	}
}
