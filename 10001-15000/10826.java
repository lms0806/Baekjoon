import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		if(size < 2) {
			sb.append(size);
		}
		else {
			BigInteger[] num = new BigInteger[size + 1];
			
			num[0] = BigInteger.ZERO;
			num[1] = BigInteger.ONE;
			
			for(int i = 2; i <= size; i++) {
				num[i] = num[i - 1].add(num[i - 2]);
			}
			sb.append(num[size]);
		}
		System.out.print(sb);
	}
}
