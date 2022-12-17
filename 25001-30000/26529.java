import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int[] dp = new int[46];
		dp[0] = dp[1] = 1;
		
		for(int i = 2; i < 46; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			sb.append(dp[Integer.parseInt(br.readLine())]).append("\n");
		}
		System.out.print(sb);
	}
}
