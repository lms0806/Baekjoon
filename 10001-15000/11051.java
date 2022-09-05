import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[][] dp = new int[1001][1001];

		for(int i = 1; i <= n; i++) {
			for(int j = 0; j <= k; j++) {
				if(i == j || j == 0) {
					dp[i][j] = 1;
				}
				else {
					dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - 1]) % 10007;
				}
			}
		}
		
		System.out.print(dp[n][k]);
	}
}
