import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] number = new int[10];
		BigInteger sum = new BigInteger(br.readLine()).multiply(new BigInteger(br.readLine())).multiply(new BigInteger(br.readLine()));
		
		while(sum.compareTo(BigInteger.ZERO) != 0) {
			number[sum.remainder(BigInteger.TEN).intValue()]++;
			sum = sum.divide(new BigInteger("10"));
		}
		
		for(int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}
}
