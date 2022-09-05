import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] dp = new int[11];
		dp[1] = 0;
		dp[2] = 1;
		
		for(int i = 3; i <= 10; i++) {
			dp[i] = dp[i - 1] + i - 1;
		}
		System.out.print(dp[Integer.parseInt(br.readLine())]);
	}
}
