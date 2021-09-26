import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		while (true) {
			int answer = 0, count = 0;
			int a = Integer.parseInt(br.readLine());
			
			if (a == 0) {
				break;
			}
			
			for (int i = a + 1; i <= 2 * a; i++) {
				int max = (int) Math.sqrt(i) + 1;
				for (int j = 2; j < max; j++) {
					if (i % j == 0) {
						count++;
						break;
					}
				}
				if (count == 0) {
					answer++;
				}
				count = 0;
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
