import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()) + 1, m = Integer.parseInt(st.nextToken());
		
		int[][] dp = new int[n][n];
		for(int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j < n; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + Integer.parseInt(st.nextToken());
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken()), y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken()), y2 = Integer.parseInt(st.nextToken());
			
			sb.append(dp[x2][y2] - dp[x2][y1 - 1] - dp[x1 - 1][y2] + dp[x1 - 1][y1 - 1]).append("\n");
		}
		System.out.print(sb);
	}
}
