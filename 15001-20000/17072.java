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
		int r, g, b;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				r = Integer.parseInt(st.nextToken());
				g = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				
				int num = 2126 * r + 7152 * g + 722 * b;
				
				sb.append(num < 510000 ? "#" : num < 1020000 ? "o" : num < 1530000 ? "+" : num < 2040000 ? "-" : ".");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
