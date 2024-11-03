import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] dp = new int[21];
		dp[0] = dp[1] = 1;
		
		for(int i = 2; i < 21; i++) {
			dp[i] = dp[i - 1] * 2;
			if(i % 2 == 0) {
				if(i > 3) {
					dp[i] -= dp[i - 4];
				}
				if(i > 4) {
					dp[i] -= dp[i - 5];
				}
			}
		}
		System.out.print(dp[Integer.parseInt(br.readLine())]);
	}
}
