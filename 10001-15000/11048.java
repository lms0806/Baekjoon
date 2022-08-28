import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()) + 1, m = Integer.parseInt(st.nextToken()) + 1;
		
		int[][] arr = new int[n][m];
		for(int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] dp = new int[n][m];
		for(int i = 1; i < n; i++) {
			for(int j = 1; j < m; j++) {
				dp[i][j] = max(max(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + arr[i][j];
			}
		}
		
		System.out.print(dp[n - 1][m - 1]);
	}
	
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
}
