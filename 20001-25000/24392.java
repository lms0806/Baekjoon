import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		long[][] dp = new long[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(i == 0) {
					dp[i][j] = arr[i][j];
				}
			}
			
			if(i > 0) {
				for(int j = 0; j < m; j++) {
					if(arr[i][j] == 1) {
						dp[i][j] += dp[i - 1][j];
						
						if(j > 0) {
							dp[i][j] += dp[i - 1][j - 1];
						}
						if(j < m - 1) {
							dp[i][j] += dp[i - 1][j + 1];
						}
						
						dp[i][j] %= 1000000007;
					}
				}
			}
		}
		
		long answer = 0;
		for(int i = 0; i < m; i++) {
			answer += dp[n - 1][i];
			
			answer %= 1000000007;
		}
		System.out.print(answer);
		
		
	}
}
