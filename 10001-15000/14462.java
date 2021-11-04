import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[] a = new int[n], b = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(br.readLine());
		}
		
		int[][] dp = new int[n + 1][n + 1];
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				if(Math.abs(a[i - 1] - b[j - 1]) <= 4) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				}
			}
    }
		System.out.print(dp[n][n]);
	}
}
