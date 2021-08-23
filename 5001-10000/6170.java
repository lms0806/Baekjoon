import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] dp = new int[46];
		dp[0] = 2;
		dp[1] = 3;
		for(int i = 2; i < 46; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= size; i++) {
			sb.append("Scenario #").append(i).append(":\n").append(dp[Integer.parseInt(br.readLine()) - 1]).append("\n\n");
		}
		System.out.print(sb);
	}
}
