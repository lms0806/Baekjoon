import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			sb.append(solve(st.nextToken(), Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken())) ? "May Pass." : "TLE!").append("\n");
		}
		System.out.print(sb);
	}
	
	public static boolean solve(String s, long num, long t, long l) {
		long max = 100000000 * l;
		if("O(N)".equals(s)) {
			return num * t <= max;
		}
		else if("O(N^2)".equals(s)) {
			return num * num * t <= max;
		}
		else if("O(N^3)".equals(s)) {
			return num > 1000 ? false : num * num * num * t <= max;
		}
		else if("O(2^N)".equals(s)) {
			return num > 29 ? false : Math.pow(2, num) * t <= max;
		}
		return num > 12 ? false : fact(num) * t <= max;
	}
	
	public static long fact(long num) {
		return num == 1 ? 1 : num * fact(num - 1);
	}
}
