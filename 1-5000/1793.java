import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger[] dp = new BigInteger[251];
		dp[1] = dp[0] = new BigInteger("1");
		dp[2] = new BigInteger("3");
		
		for(int i = 2; i < 251; i++) {
			dp[i] = dp[i - 2].multiply(BigInteger.TWO);
			dp[i] = dp[i].add(dp[i - 1]);
		}
		
		String s;
		StringBuilder sb = new StringBuilder();
		while((s = br.readLine()) != null) {
			sb.append(dp[Integer.parseInt(s)]).append("\n");
		}
		System.out.print(sb);
	}
}
