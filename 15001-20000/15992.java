import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static long mod = 1000000009;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		long[][] dp = new long[1001][1001];
		
		dp[1][1] = 1;
		
		dp[2][1] = 1;
		dp[2][2] = 1;
		
		dp[3][1] = 1;
		dp[3][2] = 2;
		dp[3][3] = 1;
		
		for(int i = 4; i < dp.length; i++) {
			for(int j = 1; j < i + 1; j++) {
				dp[i][j] = (dp[i - 1][j - 1] + dp[i - 2][j - 1] + dp[i - 3][j - 1]) % mod;
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			sb.append(dp[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]).append("\n");
		}
		System.out.print(sb);
	}
}
