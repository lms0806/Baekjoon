import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[10001];
		dp[1] = 1;
		dp[2] = 1;
		
		int answer = 0;
		for(int i = 1; i < 10001; i++) {
			if(i > 2) {
				dp[i] = dp[i - 1] + dp[i - 2];
			}
			n -= dp[i];
			
			if(n <= 0) {
				answer = i;
				break;
			}
		}
		System.out.print(answer);
	}
}
