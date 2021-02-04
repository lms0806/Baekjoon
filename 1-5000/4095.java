import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int answer = 0;
			
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			if(n == 0 || m == 0){
				break;
			}
			
			int[][] num = new int[n][m];
			int[][] dp = new int[1001][1001];
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int j = 0; j < m; j++) {
					num[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= m; j++) {
					if(num[i-1][j-1] == 1) {
						dp[i][j] = (int)Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + 1;
						answer = Math.max(answer, dp[i][j]);
					}
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.println(sb);
	}
}
