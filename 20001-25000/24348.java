import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken()), c = Long.parseLong(st.nextToken());
		
		long answer = max(a * b + c, a * b - c);
		answer = max(answer, max(a + b * c, a + b - c));
		answer = max(answer, max(a - b + c, a - b * c));
		answer = max(answer, max(a * c + b, a * c - b));
		answer = max(answer, max(a + c * b, a + c - b));
		answer = max(answer, max(a - c + b, a - c * b));
		System.out.print(answer);
	}
	
	public static long max(long a, long b) {
		return a > b ? a : b;
	}
}
