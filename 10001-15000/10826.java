import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.print(solve(Integer.parseInt(br.readLine())));
	}
	
	public static String solve(int n) {
		if(n < 2) {
			return Integer.toString(n);
		}
		BigInteger[] num = new BigInteger[n + 1];
		num[0] = BigInteger.ZERO;
		num[1] = BigInteger.ONE;
		
		for(int i = 2; i <= n; i++) {
			num[i] = num[i - 1].add(num[i - 2]);
		}
		return num[n].toString();
	}
}
