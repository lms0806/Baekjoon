import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] dp = new int[45];
		dp[0] = 1;
		
		int count = 2;
		for(int i = 1; i < dp.length; i++) {
			dp[i] = dp[i - 1] + count;
			count++;
		}
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			sb.append(solve(dp, Integer.parseInt(br.readLine()))).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int solve(int[] dp, int n) {
		for(int i = 0; dp[i] + dp[0] * 2 <= n; i++) {
			for(int j = 0; dp[i] + dp[j] + dp[0] <= n; j++) {
				for (int k = 0; dp[i] + dp[j] + dp[k] <= n; k++) {
					if(dp[i] + dp[j] + dp[k] == n) {
						return 1;
					}
				}
			}
		}
		return 0;
	}
}
