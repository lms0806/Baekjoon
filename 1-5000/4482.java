import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int[] dp = new int[1001], sum = new int[1001];

		for(int i = 1; i < dp.length; i++) {
			sum[i] = sum[i - 1] + i;
			dp[i] = dp[i - 1] + sum[i];
		}
		
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			sb.append(i).append(": ").append(n).append(" ").append(dp[n]).append("\n");
		}
		System.out.print(sb);
	}
}
