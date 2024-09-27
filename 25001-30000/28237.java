import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(solve(Integer.parseInt(br.readLine())));	
	}
	
	public static String solve(int n) {
		int a = 0, b = 0, c = 0, d = 0;
		for(a = 1; a <= n; a++) {
			if(n % a != 0) {
				continue;
			}
			
			c = n / a;
			
			for(b = 1; b <= n + 2; b++) {
				if((n + 2) % b != 0) {
					continue;
				}
				
				d = -(n + 2) / b;
				
				if(a * d + b * c == n + 1) {
					return a + " " + b + " " + c + " " + d;
				}
			}
		}
		return "-1";
	}
}
