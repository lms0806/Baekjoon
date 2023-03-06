import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = 1;
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			int[][] arr = new int[n][3];
			long[][] dp = new long[n][3];
			
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < 3; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			dp[0][0] = Integer.MAX_VALUE;
			dp[0][1] = arr[0][1];
			dp[0][2] = arr[0][1] + arr[0][2];
			
			for(int i = 1; i < n; i++) {
				dp[i][0] = Math.min(dp[i - 1][0], dp[i - 1][1]) + arr[i][0];
				dp[i][1] = Math.min(Math.min(dp[i][0], dp[i - 1][0]), Math.min(dp[i - 1][1], dp[i - 1][2])) + arr[i][1];
				dp[i][2] = Math.min(dp[i][1], Math.min(dp[i - 1][1], dp[i - 1][2])) + arr[i][2];
			}
			
			
			sb.append(t).append(". ").append(dp[n - 1][1]).append("\n");
			t++;
		}
		System.out.print(sb);
	}
}
