import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
			
			sb.append(a + 1).append(" ").append(b).append(" ").append(c).append("\n");
			sb.append(a / b + a / c - (a / lcm(b, c))).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
	
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
