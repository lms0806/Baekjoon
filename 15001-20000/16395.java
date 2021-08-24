import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[][] dp = new int[n + 1][n + 1];
		
		dp[1][1] = 1;
		for(int i = 2; i <= n; i++) {
			dp[i][1] = 1;
			for(int j = 1; j < n; j++) {
				dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
			}
			dp[i][n] = 1;
		}
		System.out.print(dp[n][k]);
	}
}
