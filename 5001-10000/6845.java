import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int y = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
			
			sb.append(y < 1989 || (y == 1989 && m < 2) || (y == 1989 && m == 2 && d <= 27) ? "Yes" :"No").append("\n");
		}
		System.out.print(sb);
	}
}
