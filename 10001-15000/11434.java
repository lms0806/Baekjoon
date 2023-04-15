import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
			
			int answer = 0;
			while(n --> 0) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
				
				answer += Math.max(a * w + c * e, e * d + b * w);
			}
			
			sb.append("Data Set ").append(t).append(":").append("\n");
			sb.append(answer).append("\n\n");
		}
		System.out.print(sb);
	}
}
