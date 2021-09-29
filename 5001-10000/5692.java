import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		while (true) {
			String str = br.readLine();
			
			if (str.equals("0")) {
				break;
			}

			int answer = 0;
			for (int i = 0; i < str.length(); i++) {
				answer += (str.charAt(str.length() - i - 1) - '0') * fact(i + 1);
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}

	public static int fact(int a) {
		return a <= 1 ? a : fact(a - 1) * a;
	}
}
