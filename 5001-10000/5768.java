import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			if(n == 0 && m == 0) {
				break;
			}
			
			int x = 0, y = 0;
			for(int i = n; i <= m; i++) {
				int count = 0;
				
				for(int j = 1; j <= i; j++) {
					if(i % j == 0) {
						count++;
					}
				}
				
				if(count >= y) {
					x = i;
					y = count;
				}
			}
			
			sb.append(x).append(" ").append(y).append("\n");
		}
		System.out.print(sb);
	}
}
