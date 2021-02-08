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
		for(int i = 0; i < size; i++) {
			n = n.multiply(new BigInteger(st.nextToken()));
		}
		
		size = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			m = m.multiply(new BigInteger(st.nextToken()));
		}
		
		String gcd = n.gcd(m).toString();
		
		if(gcd.length() > 9) {
			gcd = gcd.substring(gcd.length() - 9, gcd.length());
		}
				
		System.out.print(gcd);
	}
}
