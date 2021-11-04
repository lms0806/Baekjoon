import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int[][] num, dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		num = new int[m + 1][n + 1];
		dp = new int[m + 1][n + 1];
		
		for(int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= n; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 1; i <= m; i++) {
			Arrays.fill(dp[i], -1);
		}
		
		System.out.print(dfs(1, 1));
	}
	
	public static int dfs(int x, int y) {
		if(x == m && y == n) {
			return 1;
		}
		
		if(dp[x][y] != -1) {
			return dp[x][y];
		}
		
		dp[x][y] = 0;
		for(int i = 0; i < 4; i++) {
			int nextx = x + dx[i];
			int nexty = y + dy[i];
			
			if(nextx > 0 && nextx <= m && nexty > 0 && nexty <= n) {
				if(num[x][y] > num[nextx][nexty]) {
					dp[x][y] += dfs(nextx, nexty);
				}
			}
		}
		
		return dp[x][y];
	}
}
