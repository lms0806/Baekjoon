import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		BigInteger n = new BigInteger(br.readLine(),2).multiply(new BigInteger("17"));
		
		String answer = n.toString(2);
		System.out.println(answer);
	}
}
