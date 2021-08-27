import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[2][n + 1];
			for(int i = 0; i < 2; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 1; j <= n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int[][] dp = new int[2][n + 1];
			
			dp[0][1] = arr[0][1];
			dp[1][1] = arr[1][1];
			for(int i = 2; i <= n; i++) {
				dp[0][i] = max(dp[1][i - 2], dp[1][i - 1]) + arr[0][i];
				dp[1][i] = max(dp[0][i - 1], dp[0][i - 2]) + arr[1][i];
			}
			
			sb.append(max(dp[1][n], dp[0][n])).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
}
