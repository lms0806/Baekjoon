import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] dp = new int[20001], arr = new int[m];

		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < m; j++) {
				dp[i == j ? arr[i] : arr[i] + arr[j]] = 1;
			}
		}
		
		for(int i = 1; i <= n; i++) {
			if(dp[i] == 1) {
				continue;
			}
			
			for(int j = 1; j <= i / 2; j++) {
				if(dp[j] == -1 || dp[i - j] == -1) {
					continue;
				}
				dp[i] = Math.min(dp[i], dp[i - j] + dp[j]);
			}
			
			if(dp[i] == Integer.MAX_VALUE) {
				dp[i] = -1;
			}
		}
		System.out.print(dp[n]);
	}
}
