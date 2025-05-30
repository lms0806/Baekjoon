import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());
		
		int[] dp = new int[41];
		dp[1] = 2;
		dp[2] = 3;
		for(int i = 3; i < dp.length; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= test; t++) {
			sb.append("Scenario ").append(t).append(":").append("\n");
			sb.append(dp[Integer.parseInt(br.readLine())]).append("\n\n");
		}
		System.out.print(sb);
	}
}
