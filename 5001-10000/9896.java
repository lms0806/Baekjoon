import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.readLine();
		String s = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		sb.append(s.charAt(0));
		for(int i = 1; i < s.length(); i++) {
			sb.append((s.charAt(i - 1) - '0')^(s.charAt(i) - '0'));
		}
		System.out.print(sb);
	}
}
