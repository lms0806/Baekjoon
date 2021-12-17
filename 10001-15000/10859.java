import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n, c;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(solve(Long.parseLong(br.readLine())));
	}
	
	public static String solve(long n) {
		if(!isprime(n) || !check(n)) {
			return "no";
		}
		
		n = reverse(n);
		
		return !isprime(n) ? "no" : "yes";
	}
	
	public static boolean check(long n) {
		while(n > 0) {
			long num = n % 10;
			if(num == 3 || num == 4 || num == 7) {
				return false;
			}
			n /= 10;
		}
		return true;
	}
	
	public static long reverse(long n) {
		long num = 0;
		while(n > 0) {
			if(n % 10 == 6) {
				num = num * 10 + 9;
			}
			else if(n % 10 == 9) {
				num = num * 10 + 6;
			}
			else {
				num = num * 10 + n % 10;
			}
			n /= 10;
		}
		return num;
	}
	
	public static boolean isprime(long n) {
		if(n == 1) {
			return false;
		}
		for(long i = 2; i * i <= n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
