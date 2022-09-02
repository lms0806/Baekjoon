import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		char c = '*';
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				sb.append(c);
				c = c == '*' ? '.' : '*';
			}
			if(m % 2 == 0) {
				c = c == '*' ? '.' : '*';
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
