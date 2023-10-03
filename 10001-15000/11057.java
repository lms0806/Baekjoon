import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] dp = new int[n + 1][10];
		
		for(int i = 0; i < 10; i++) {
			dp[1][i] = 1;
		}
		
		for(int i = 2; i <= n; i++) {
			for(int j = 0; j < 10; j++) {				
				dp[i][j] = j == 0 ? 1 : dp[i - 1][j] + dp[i][j - 1] % 10007;
			}
		}
		
		int answer = 0;
		for(int i = 0; i < 10; i++) {
			answer += dp[n][i];
		}
		System.out.print(answer % 10007);
	}
}
