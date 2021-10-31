import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());

			if (b == 0) {
				break;
			}
			sb.append(new BigInteger(st.nextToken(), b).remainder(new BigInteger(st.nextToken(), b)).toString(b)).append("\n");
		}
		System.out.print(sb);
	}
}
