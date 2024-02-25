import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		BigInteger a = BigInteger.ZERO, b = BigInteger.ONE;
		for(int i = 2; i <= n; i++) {
			b = lcm(b, BigInteger.valueOf(i));
		}
		for(int i = 1; i <= n; i++) {
			a = a.add(b.divide(BigInteger.valueOf(i)));
		}
		
		BigInteger gcd = a.gcd(b);
		System.out.println((a.divide(gcd)) + "\n" + (b.divide(gcd)));
	}
	
	public static BigInteger lcm(BigInteger a, BigInteger b) {
		return a.multiply(b).divide(a.gcd(b));
	}
}
