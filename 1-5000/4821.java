import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		while (true) {
			int n = Integer.parseInt(br.readLine());

			if (n == 0) {
				break;
			}

			int[] num = new int[n + 1];
			StringTokenizer st = new StringTokenizer(br.readLine(), ",");
			while (st.hasMoreTokens()) {
				String s = st.nextToken();
				if (s.contains("-")) {
					String[] str = s.split("-");
					int a = Integer.parseInt(str[0]), b = Integer.parseInt(str[1]);

					if (a <= b && a <= n) {
						if (b > n) {
							b = n;
						}
						for (int i = a; i <= b; i++) {
							num[i] = 1;
						}
					}
				} else {
					int x = Integer.parseInt(s);
					if (x <= n) {
						num[x] = 1;
					}
				}
			}

			int count = 0;
			for (int a : num) {
				if (a == 1) {
					count++;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.print(sb);
	}
}
