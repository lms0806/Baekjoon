import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.print(solve(Long.parseLong(br.readLine())));
	}
	
	public static long solve(long n) {
		long answer = n;
		for(long i = 2; i * i <= n; i++) {
			if(n % i == 0) {
				answer = answer / i * (i - 1);
				while(n % i == 0) {
					n /= i;
				}
			}
		}
		return n > 1 ? answer / n * (n - 1) : answer;
	}
}
