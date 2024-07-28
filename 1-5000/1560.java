import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger n = new BigInteger(br.readLine());
		
		System.out.print(n.compareTo(BigInteger.TWO) <= 0 ? n : n.add(n).subtract(BigInteger.TWO));
	}
}
