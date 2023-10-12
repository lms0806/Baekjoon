import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n + 1];
		
		for(int i = 1; i <= n; i++) {
			dp[i] = i;
		}
		
		for(int i = 2; i <= n; i++) {
			if(i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 2]);
			}
			if(i % 3 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 3]);
			}
			dp[i] = Math.min(dp[i], dp[i - 1]) + 1;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(dp[n] - 1).append("\n");
		while(n != 0) {
			sb.append(n).append(" ");
			
			if(dp[n] == dp[n - 1] + 1) {
				n -= 1;
			}
			else if(n % 2 == 0 && dp[n] == dp[n / 2] + 1) {
				n >>= 1;
			}
			else {
				n /= 3;
			}
		}
		System.out.print(sb);
	}
}
