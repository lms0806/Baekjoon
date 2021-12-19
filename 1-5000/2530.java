import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(br.readLine());

		c += d;

		b += c / 60;
		c %= 60;

		a += b / 60;
		b %= 60;

		a %= 24;

		System.out.print(a + " " + b + " " + c);
	}
}
