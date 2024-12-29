import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long answer = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			long num = Long.parseLong(st.nextToken());
			
			answer = i > 0 ? lcm(answer, num) : num;
		}
		System.out.print(answer << 1);
	}
	
	public static long gcd(long a, long b) {
		return b > 0 ? gcd(b, a % b) : a;
	}
	
	public static long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}
}
