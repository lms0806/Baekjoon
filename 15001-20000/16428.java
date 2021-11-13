import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		BigInteger a = new BigInteger(st.nextToken());
		BigInteger b = new BigInteger(st.nextToken());
		BigInteger div = a.divide(b);
		BigInteger rem = a.remainder(b);
		
		StringBuilder sb = new StringBuilder();
		if(a.compareTo(BigInteger.ZERO) < 0 && b.compareTo(BigInteger.ZERO) > 0) {
			div = div.subtract(BigInteger.ONE);
			sb.append(div).append("\n").append(a.subtract(b.multiply(div)));
		}
		else if(a.compareTo(BigInteger.ZERO) < 0 && b.compareTo(BigInteger.ZERO) < 0) {
			div = div.add(BigInteger.ONE);
			sb.append(div).append("\n").append(a.subtract(b.multiply(div)));
		}
		else {
			sb.append(div).append("\n").append(rem);
		}
		System.out.print(sb);
	}
}
