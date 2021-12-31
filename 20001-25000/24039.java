import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()) + 1;
		
		boolean[] prime = new boolean[10001];
		
		prime[2] = true;
		for(int i = 2; i < 10001; i++) {
			if(isprime(i)) {
				prime[i] = true;
			}
		}
		
		System.out.print(solve(n, prime));
	}
	
	public static boolean isprime(int num) {
		for(int i = 2; i * i <= num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int solve(int n, boolean[] prime) {
		for(int i = n; i < 100000001; i++) {
			for(int j = 2; j < 10001; j++) {
				if(prime[j]) {
					for(int k = j + 1; k < 10001; k++) {
						if(prime[k]) {
							if(i == j * k) {
								return i;
							}
							break;
						}
					}
				}
			}
		}
		return n;
	}
}
