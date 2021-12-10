import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		BigInteger num = BigInteger.ONE;
		for(int i = 1; i <= n; i++) {
			num = num.multiply(BigInteger.valueOf(i));
		}
		
		int answer = 0;
		while(num.compareTo(BigInteger.ZERO) != 0) {
			if(num.remainder(BigInteger.TEN).compareTo(BigInteger.ZERO) == 0) {
				answer++;
			}
			num = num.divide(BigInteger.TEN);
		}
		System.out.print(answer);
	}
}
