import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int l = (Integer.parseInt(st.nextToken()) - 4) / 2, w = Integer.parseInt(st.nextToken());

		for (int i = 0; i <= l; i++) {
			if ((l - i) * i == w) {
				System.out.print((l - i + 2) + " " + (i + 2));
				break;
			}
		}
	}
}
