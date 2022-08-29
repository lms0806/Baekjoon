import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()) + 1;
		
		int[][] arr = new int[n][n];
		int[][] dp = new int[n][n];
		
		for(int i = 1; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dp[1][1] = arr[1][1];
		
		for(int i = 2; i < n; i++) {
			for(int j = 1; j <= i; j++) {
				dp[i][j] = arr[i][j] + Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
			}
		}
		
		int answer = 0;
		for(int i = 1; i < n; i++) {
			answer = Math.max(answer, dp[n - 1][i]);
		}
		System.out.print(answer);
	}
}
