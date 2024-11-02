import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static long mod = 1000000009;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long[][] dp = new long[1001][1001];
		
		dp[1][1] = dp[2][1] = dp[2][2] = dp[3][1] = dp[3][3] = 1;
		dp[3][2] = 2;
		
		for(int i = 4; i < dp.length; i++) {
			for(int j = 2; j <= i; j++) {
				dp[i][j] += (dp[i - 1][j - 1] % mod + dp[i - 2][j - 1] % mod + dp[i - 3][j - 1] % mod) % mod;
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			long answer = 0;
			for(int i = 1; i <= m; i++) {
				answer = (answer % mod + dp[n][i] % mod) % mod;
			}
			
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
