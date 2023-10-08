import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[] dp = new int[k + 1];
		
		Arrays.fill(dp, 10001);
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num > k) {
				continue;
			}
			
			dp[num] = 1;
			
			for(int j = num; j <= k; j++) {
				dp[j] = Math.min(dp[j], dp[j - num] + 1);
			}
		}
		
		System.out.print(dp[k] == 10001 ? -1 : dp[k]);
	}
}
