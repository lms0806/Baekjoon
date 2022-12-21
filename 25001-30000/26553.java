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
			int k = Integer.parseInt(st.nextToken()), p = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
			
			double answer = Double.MAX_VALUE;
			for(int i = 1; i <= 10000; i++) {
				answer = Math.min(answer, x * i + ((double) k / i) * p);
			}
			
			sb.append(String.format("%.3f", answer)).append("\n");
		}
		System.out.print(sb);
	}
}
