import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		BigInteger num = new BigInteger(br.readLine());
		
		int answer = 64;
		while(true) {
			if(num.remainder(BigInteger.TWO) != BigInteger.ZERO) {
				break;
			}
			else {
				num = num.divide(BigInteger.TWO);
			}
			answer--;
		}
		System.out.print(answer);
	}
}
