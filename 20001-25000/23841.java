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
		
		for(int i = 0; i < n; i++) {
			ch[i] = br.readLine().toCharArray();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(ch[i][j] != '.') {
					ch[i][m - j - 1] = ch[i][j];
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(char[] c : ch) {
			sb.append(c).append("\n");
		}
		System.out.print(sb);
	}
}
