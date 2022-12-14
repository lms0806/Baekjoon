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
			
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			sb.append("Data set: ").append(a).append(" ").append(b).append(" ").append(n).append("\n");
			while(n --> 0) {
				if(a >= b) {
					a /= 2;
				}
				else {
					b /= 2;
				}
			}
			sb.append(Math.max(a, b)).append(" ").append(Math.min(a, b)).append("\n\n");
		}
		System.out.print(sb);
	}
}
