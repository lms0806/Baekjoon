import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= test; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			long r = Long.parseLong(st.nextToken()), a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());
			
			double answer = Math.PI * r * r;
			while(r > 0) {
				answer += Math.PI * (r * a * r * a);
				answer += Math.PI * ((r * a / b) * (r * a / b));
				r = r * a / b;
			}
			
			sb.append("Case #").append(t).append(": ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
