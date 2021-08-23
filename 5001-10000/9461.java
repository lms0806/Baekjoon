import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long[] dp = new long[100];
		
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 1;
		
		for(int i = 3; i < 100; i++) {
			dp[i] = dp[i - 2] + dp[i - 3];
		}
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			sb.append(dp[Integer.parseInt(br.readLine()) - 1]).append("\n");
		}
		System.out.print(sb);
	}
}
