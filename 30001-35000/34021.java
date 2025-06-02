import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken());
			
			int answer = m;
			st = new StringTokenizer(br.readLine());
			while(n --> 0) {
				int num = Integer.parseInt(st.nextToken());
				
				if(num != -1) {
					answer = Math.min(answer, num);
				}
			}
			
			answer = Math.max(l, m - answer);
			
			sb.append(String.format("The scoreboard has been frozen with %d minute%s remaining.", answer, answer == 1 ? "" : "s")).append("\n");
		}
		System.out.print(sb);
	}
}
