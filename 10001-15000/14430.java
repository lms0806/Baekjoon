import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n + 1][m + 1], dp = new int[n + 1][m + 1];
		
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j = 1; j <= m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				dp[i][j] = Math.max(dp[i][j], dp[i - 1][j] + (arr[i][j] == 1 ? 1 : 0));
				dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + (arr[i][j] == 1 ? 1 : 0));
				
				answer = Math.max(answer, dp[i][j]);
			}
		}
		System.out.print(answer);
	}
}
