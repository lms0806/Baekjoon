import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= test; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();
			int b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
			
			int answer = 0;
			while(c != 0) {
				answer += (c % b) * (c % b);
				c /= b;
			}
			
			sb.append(t).append(" ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
