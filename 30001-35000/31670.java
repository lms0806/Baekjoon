import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long[] arr = new long[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		long[][] dp = new long[n][2];
		dp[0][1] = arr[0];
		
		for(int i = 1; i < n; i++) {
			dp[i][0] = dp[i - 1][1];
			dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][1]) + arr[i];
		}
		System.out.print(Math.min(dp[n - 1][0], dp[n - 1][1]));
	}
}
