import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		System.out.print(solve(new BigInteger(st.nextToken()), Integer.parseInt(st.nextToken())));
	}
	
	public static String solve(BigInteger k, int l) {
		for(int i = 2; i < l; i++) {
			if(k.remainder(BigInteger.valueOf(i)) == BigInteger.ZERO) {
				return "BAD " + i;
			}
		}
		return "GOOD";
	}
}
