import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = 1;
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			double answer = 0;
			while(n --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
				
				double chicken = a / 85.0;
				double beaf = b / 85.0;
				double lamb = c / 85.0;
				
				answer += a * 0.8;
				answer += b;
				answer += c * 1.2;
				answer += d * 0.8;
				
				answer -= 15.5 * chicken;
				answer -= 32.0 * beaf;
				answer -= 40.0 * lamb;
				
				answer -= 0.2 * d;
			}
			sb.append(String.format("Case #%d: RM%.2f\n", t++, answer));
		}
		System.out.print(sb);
	}
}
