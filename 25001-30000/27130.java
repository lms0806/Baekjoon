import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger a = new BigInteger(br.readLine()), b = new BigInteger(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		sb.append(a).append("\n").append(b).append("\n");
		
		BigInteger sum = a.multiply(b);
		while(b.compareTo(BigInteger.ZERO) == 1) {
			sb.append(a.multiply(b.remainder(BigInteger.TEN))).append("\n");
			b = b.divide(BigInteger.TEN);
		}
		sb.append(sum);
		System.out.print(sb);
	}
}
