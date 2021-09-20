import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		while (size-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());

			sb.append(a * b / gcd(a, b)).append("\n");
		}
		System.out.print(sb);
	}

	public static long gcd(long a, long b) {
		return a % b == 0 ? b : gcd(b, a % b);
	}
}
