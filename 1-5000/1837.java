import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		BigInteger p = new BigInteger(st.nextToken()), k = new BigInteger(st.nextToken());
		
		String answer = "GOOD";
		for(BigInteger i = BigInteger.TWO; i.compareTo(k) < 0; i = i.add(BigInteger.ONE)) {
			if(p.remainder(i).compareTo(BigInteger.ZERO) == 0) {
				answer = "BAD " + i;
				break;
			}
		}
		System.out.print(answer);
	}
}
