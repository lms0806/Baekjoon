import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		BigInteger[] dp = new BigInteger[491];
		dp[0] = BigInteger.ZERO;
		dp[1] = BigInteger.ONE;
		
		for(int i = 2; i <= 490; i++) {
			dp[i] = dp[i - 1].add(dp[i - 2]);
		}
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == -1) {
				break;
			}
			
			sb.append("Hour ").append(n).append(": ").append(dp[n]).append(" cow(s) affected").append("\n");
		}
		System.out.print(sb);
	}
}
