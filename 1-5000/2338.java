import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String a = br.readLine();
		String b = br.readLine();
		
        StringBuilder sb = new StringBuilder();
		sb.append(new BigInteger(a).add(new BigInteger(b))).append("\n");
		sb.append(new BigInteger(a).subtract(new BigInteger(b))).append("\n");
		sb.append(new BigInteger(a).multiply(new BigInteger(b))).append("\n");
		
		System.out.print(sb);
	}
}
