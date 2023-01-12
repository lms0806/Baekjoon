import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken()) - 1;
		
		BigInteger num = BigInteger.ONE;
		StringBuilder sb = new StringBuilder();
		while(sb.length() < n) {
			sb.append(num);
			
			num = num.multiply(BigInteger.valueOf(x));
		}
		System.out.print(sb.charAt(n));
	}
}
