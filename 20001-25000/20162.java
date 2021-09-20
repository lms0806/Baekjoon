import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] num = new int[n], dp = new int[n];
		
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(br.readLine());
			dp[i] = num[i];
		}
		
		int answer = dp[0];
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < i; j++) {
				if(num[i] > num[j]) {
					dp[i] = Math.max(dp[i], dp[j] + num[i]);
				}
			}
			answer = Math.max(answer, dp[i]);
		}
		
		System.out.print(answer);
	}
}
