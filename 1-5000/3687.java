import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] makeMin = {0, 0, 1, 7, 4, 2, 0, 8, 10};
		long[] dp = new long[101];
		
		for(int i = 0; i < makeMin.length; i++) {
			dp[i] = makeMin[i];
		}
		dp[6] = 6;
		
		for(int i = 9; i < 101; i++) {
			dp[i] = dp[i - 2] * 10 + makeMin[2];
			for(int j = 3; j < 8; j++) {
				dp[i] = Math.min(dp[i], dp[i - j] * 10 + makeMin[j]);
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			sb.append(dp[n]).append(" ");
			
			if(n % 2 != 0) {
				n -= 3;
				sb.append(7);
			}
			
			for(int i = 0; i < n / 2; i++) {
				sb.append(1);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
