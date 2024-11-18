import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = print(br.readLine()) + print(br.readLine()) + print(br.readLine());
		
		System.out.print(String.format("%04d", Long.parseLong(a, 2)));
	}
	
	public static String print(String s) {
		String str = new BigInteger(s).toString(2);
		
		str = String.format("%04d", new BigInteger(str));
		
		return str.substring(str.length() - 4);
	}
}
