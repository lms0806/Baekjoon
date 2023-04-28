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
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		int[] dp = new int[n + 1];
		
		Arrays.fill(dp, 100001);
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
			
			for(int i = l; i <= r; i++) {
				dp[i] = -1;
			}
		}
		
		dp[0] = 0;
		
		for(int i = 1; i <= n; i++) {
			if(dp[i] != -1) {
				if(i >= a && dp[i - a] != -1) {
					dp[i] = Math.min(dp[i], dp[i - a] + 1);
				}
				if(i >= b && dp[i - b] != -1) {
					dp[i] = Math.min(dp[i], dp[i - b] + 1);
				}
			}
		}
		
		System.out.print(dp[n] == 100001 ? -1 : dp[n]);
	}
}
