import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			BigInteger n = new BigInteger(br.readLine());
			
			if(n.compareTo(BigInteger.ZERO) == 0) {
				break;
			}
			
			sb.append(n.remainder(BigInteger.valueOf(42)).compareTo(BigInteger.ZERO) == 0 ? "PREMIADO" : "TENTE NOVAMENTE").append("\n");
		}
		System.out.print(sb);
	}
}
