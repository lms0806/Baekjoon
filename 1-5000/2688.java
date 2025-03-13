import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long[][] dp = new long[65][10];
		
		Arrays.fill(dp[1], 1);
		
		for(int i = 2; i < 65; i++) {
			for(int j = 0; j <= 9; j++) {
				for(int k = j; k <= 9; k++) {
					dp[i][j] += dp[i - 1][k];
				}
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			long answer = 0;
			for(int i = 0; i <= 9; i++) {
				answer += dp[n][i];
			}
			
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
