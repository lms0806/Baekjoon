import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = Integer.parseInt(st.nextToken());
		sb.append(max).append(" ");
		for(int i = 1; i < n; i++) {
			int now = Integer.parseInt(st.nextToken());
			
			if(max <= now) {
				sb.append(now).append(" ");
				max = now;
			}
		}
		System.out.print(sb);
	}
}
