import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		while (t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());

			int sum = 0;
			st = new StringTokenizer(br.readLine());
			while (n --> 0) {
				sum += Integer.parseInt(st.nextToken()) / k;
			}
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}
