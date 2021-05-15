import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			long n = Long.parseLong(br.readLine());
			long i = n;
			
			while(true) {
				if(isPrime(i)) {
					sb.append(i).append("\n");
					break;
				}
				i++;
			}
		}
		System.out.print(sb);
	}
	
	public static boolean isPrime(long n) {
		if(n <= 1) {
			return false;
		}
		
		for(int i = 2; (long)i * i <= n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
