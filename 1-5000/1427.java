import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split("");

		Arrays.sort(s);

		StringBuilder sb = new StringBuilder();
		for (int i = s.length - 1; i >= 0; i--) {
			sb.append(s[i]);
		}
		System.out.print(sb);
	}
}
