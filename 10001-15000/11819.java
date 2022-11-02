import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		BigInteger a = new BigInteger(st.nextToken()), b = new BigInteger(st.nextToken()), c = new BigInteger(st.nextToken());
		
		System.out.print(solve(a.mod(c), b, c));
	}
	
	public static BigInteger solve(BigInteger a, BigInteger b, BigInteger c) {
		if(b.equals(BigInteger.ZERO)) {
			return BigInteger.ONE;
		}
		else if(b.equals(BigInteger.ONE)) {
			return a;
		}
		
		BigInteger value = solve(a, b.divide(BigInteger.TWO), c);
		if(b.remainder(BigInteger.TWO).equals(BigInteger.ZERO)) {
			return calc(value, value, c);
		}
		return calc(calc(value, value, c), a, c);
	}
	
	public static BigInteger calc(BigInteger a, BigInteger b, BigInteger c) {
		return a.multiply(b).mod(c);
	}
}
