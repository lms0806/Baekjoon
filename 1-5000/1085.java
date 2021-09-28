import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken());

		System.out.println(min(min(w - x, x), min(h - y, y)));
	}

	public static int min(int a, int b) {
		return a > b ? b : a;
	}
}
