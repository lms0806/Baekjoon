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
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());

			double n = 0;
			int[] number = new int[num];
			for (int i = 0; i < num; i++) {
				number[i] = Integer.parseInt(st.nextToken());
				n += number[i];
			}
			n /= num;

			double count = 0;
			for (int i = 0; i < num; i++) {
				if (number[i] > n) {
					count++;
				}
			}

			sb.append(String.format("%.3f", Math.round(count * 100 / num * 1000) / 1000.0) + "%").append("\n");
		}
		System.out.println(sb);
	}
}
