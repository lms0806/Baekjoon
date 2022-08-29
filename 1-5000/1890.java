import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		long[][] dp = new long[n][n];
		dp[0][0] = 1;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(dp[i][j] == 0 || (i == n - 1 && j == n - 1)) {
					continue;
				}
				
				int down = arr[i][j] + i;
				int right = arr[i][j] + j;
				
				if(down < n) {
					dp[down][j] += dp[i][j];
				}
				if(right < n) {
					dp[i][right] += dp[i][j];
				}
			}
		}
		System.out.print(dp[n - 1][n - 1]);
	}
}
