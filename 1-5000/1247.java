import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size;
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 3; i++) {
			BigInteger sum = new BigInteger("0");
			size = Integer.parseInt(br.readLine());
			for(int j = 0; j < size; j++) {
				BigInteger a = new BigInteger(br.readLine());
				sum = sum.add(a);
			}
			if(sum.compareTo(BigInteger.ZERO) == 0) {
				sb.append("0").append("\n");
			}
			else if(sum.compareTo(BigInteger.ZERO) == -1) {
				sb.append("-").append("\n");
			}
			else {
				sb.append("+").append("\n");
			}
		}
		System.out.print(sb);
	}
}
