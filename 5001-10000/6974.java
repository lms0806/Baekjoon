import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			BigInteger a = new BigInteger(br.readLine()), b = new BigInteger(br.readLine());
			
			sb.append(a.divide(b)).append("\n").append(a.remainder(b)).append("\n\n");
		}
		System.out.print(sb);
	}
}
