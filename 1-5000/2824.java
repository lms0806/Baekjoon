import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		BigInteger n = BigInteger.ONE, m = BigInteger.ONE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(size --> 0) {
			n = n.multiply(new BigInteger(st.nextToken()));
		}
		
		size = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		while(size --> 0) {
			m = m.multiply(new BigInteger(st.nextToken()));
		}
		
		String gcd = n.gcd(m).toString();
				
		System.out.print(gcd.length() > 9 ? gcd.substring(gcd.length() - 9, gcd.length()) : gcd);
	}
}
