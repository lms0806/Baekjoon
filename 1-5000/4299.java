import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());

		System.out.print(((x + y) % 2 != 0 || (x - y) % 2 != 0) ? -1 : solve((x + y) / 2, (x - y) / 2));
	}

	public static String solve(int a, int b) {
		if (a >= 0 && b >= 0) {
			return a >= b ? a + " " + b : b + " " + a;
		}
		return "-1";
	}
}
