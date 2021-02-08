import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		BigInteger a = new BigInteger(br.readLine());
		String str = br.readLine();
		BigInteger b = new BigInteger(br.readLine());
		
		if(str.equals("+")) {
			a = a.add(b);
		}
		else {
			a = a.multiply(b);
		}
		System.out.print(a);
	}
}
