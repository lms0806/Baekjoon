import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print(solve(br.readLine().toCharArray()));
	}

	public static String solve(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			if (i < ch.length - 1 && ((ch[i] == 'p' && ch[i + 1] == 'i') || (ch[i] == 'k' && ch[i + 1] == 'a'))) {
				i++;
			} 
			else if (i < ch.length - 2 && ch[i] == 'c' && ch[i + 1] == 'h' && ch[i + 2] == 'u') {
				i += 2;
			} 
			else {
				return "NO";
			}
		}
		return "YES";
	}
}
