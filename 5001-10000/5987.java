import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
			
			StringBuilder s = new StringBuilder(st.nextToken());
			while(c --> 0) {
				s = new StringBuilder(s.substring(n)).append(s);
			}
			sb.append(s).append("\n");
		}
		System.out.print(sb);
	}
}
