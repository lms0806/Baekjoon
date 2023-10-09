import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[] dp = new int[k + 1];
		
		dp[0] = 1;
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			for(int j = num; j <= k; j++) {
				dp[j] += dp[j - num];
			}
		}
		
		System.out.print(dp[k]);
	}
}
