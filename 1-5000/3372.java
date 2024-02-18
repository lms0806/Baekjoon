import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][n];
		BigInteger[][] dp = new BigInteger[n][n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				dp[i][j] = BigInteger.ZERO;
			}
		}
		
		dp[0][0] = BigInteger.ONE;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if((i == n - 1 && j == n - 1) || dp[i][j].compareTo(BigInteger.ZERO) == 0) {
					continue;
				}
				
				int d = i + arr[i][j], r = j + arr[i][j];
				
				if(d < n) {
					dp[d][j] = dp[d][j].add(dp[i][j]);
				}
				if(r < n) {
					dp[i][r] = dp[i][r].add(dp[i][j]);
				}
			}
		}
		
		System.out.print(dp[n - 1][n - 1]);
	}
}
