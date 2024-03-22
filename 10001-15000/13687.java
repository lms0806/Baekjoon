import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
			
			if(t == 0 && n == 0) {
				break;
			}
			
			int count = 0;
			while(t --> 0) {
				st = new StringTokenizer(br.readLine());
				
				st.nextToken();
				count += Integer.parseInt(st.nextToken());
			}
			
			sb.append(Math.max(0, 3 * n - count)).append("\n");
		}
		System.out.print(sb);
	}
}
