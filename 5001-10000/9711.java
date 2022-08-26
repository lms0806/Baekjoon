import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger[] dp = new BigInteger[10001];
		dp[0] = BigInteger.ZERO;
		dp[1] = BigInteger.ONE;
		
		for(int i = 2; i < 10001; i++) {
			dp[i] = dp[i - 1].add(dp[i - 2]);
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
			
			sb.append("Case #").append(i).append(": ").append(dp[p].mod(BigInteger.valueOf(q))).append("\n");
		}
		System.out.print(sb);
	}
}
