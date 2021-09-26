import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());

		if (b < 45) {
			if (a <= 0) {
				a = 24;
			}
			b += 60;
			a--;
		}
		System.out.print(a + " " + (b - 45));
	}
}
