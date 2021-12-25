import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long gcd = Long.parseLong(st.nextToken()), lcm = Long.parseLong(st.nextToken());
		
		long n = lcm / gcd;
		
		long a = 0, b = 0;
		for(long i = 1; i * i <= n; i++) {
			if(n % i == 0) {
				int count = 0;
				
				for(long j = 1; j <= i; j++) {
					if(i % j == 0 && (n / i) % j == 0) {
						count++;
					}
					
					if(count > 1) {
						break;
					}
				}
				
				if(count == 1) {
					a = i * gcd;
					b = (n / i) * gcd;
				}
			}
		}
		System.out.print(a + " " + b);
	}
}
