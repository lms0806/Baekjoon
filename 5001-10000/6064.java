import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken()) - 1, y = Integer.parseInt(st.nextToken()) - 1;
			
			sb.append(solve(m, n, x, y, m * n / gcd(m, n))).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int solve(int m, int n, int x, int y, int lcm) {
		int year = x;
		while(year <= lcm) {
			if(year % n == y) {
				return year + 1;
			}
			year += m;
		}
		return -1;
	}
	
	public static int gcd(int a, int b) {
		return a % b == 0 ? b : gcd(b, a % b);
	}
}
