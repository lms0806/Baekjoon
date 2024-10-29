import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print(solve(Long.parseLong(br.readLine())));
	}
	
	public static String solve(long n) {
		if(n == 0) {
			return "NO";
		}
		
		while(n != 0) {
			if(n % 3 > 1) {
				return "NO";
			}
			n /= 3;
		}
		return "YES";
	}
}
