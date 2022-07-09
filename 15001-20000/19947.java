import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
		
		int[] dp = new int[y + 1];
		dp[0] = h;
		
		for(int i = 1; i <= y; i++) {
			if(i >= 5) {
				dp[i] = (int)Math.max(dp[i - 1] * 1.05, Math.max(dp[i - 3] * 1.2, dp[i - 5] * 1.35));
			}
			else if(i >= 3) {
				dp[i] = (int)Math.max(dp[i - 1] * 1.05, dp[i - 3] * 1.2);
			}
			else {
				dp[i] = (int)(dp[i - 1] * 1.05);
			}
		}
		
		System.out.print(dp[y]);
	}
}
