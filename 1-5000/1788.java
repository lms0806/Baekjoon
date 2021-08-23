import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		if(n > 0) {
			sb.append(1);
		}
		else if(n == 0) {
			sb.append(0);
		}
		else {
			n = -n;
			sb.append(n % 2 == 0 ? -1 : 1);
		}
		sb.append("\n");
		
		int[] dp = new int[1000001];
		dp[0] = 0;
		dp[1] = 1;
		for(int i = 2; i <= n; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000000;
		}
		sb.append(dp[n]);
		
		System.out.print(sb);
	}
}
