import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int a = 0, b = 0;
		for(int i = n / 2 + 1; i < n; i++) {
			if(gcd(i, n - i) == 1) {
				a = n - i;
				b = i;
				break;
			}
		}
		System.out.print(a + " " + b);
	}
	
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
