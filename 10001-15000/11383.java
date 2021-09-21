import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

		char[][] ch = new char[n][m];

		for (int i = 0; i < n; i++) {
			ch[i] = br.readLine().toCharArray();
		}

		String[] s = new String[n];
		
		for(int i = 0; i < n; i++) {
			s[i] = br.readLine();
		}

		System.out.print(solve(ch, s));
	}
	
	public static String solve(char[][] ch, String[] s) {
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				if (ch[i][j / 2] != s[i].charAt(j)) {
					return "Not Eyfa";
				}
			}
		}
		return "Eyfa";
	}
}
