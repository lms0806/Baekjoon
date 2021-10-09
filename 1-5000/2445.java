import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for (int i = size - 1; i > 0; i--) {
			sb.append("*".repeat(size - i)).append(" ".repeat(i * 2)).append("*".repeat(size - i)).append("\n");
		}
		for (int i = 0; i <= size - 1; i++) {
			sb.append("*".repeat(size - i)).append(" ".repeat(i * 2)).append("*".repeat(size - i)).append("\n");
		}
		System.out.print(sb);
	}
}
