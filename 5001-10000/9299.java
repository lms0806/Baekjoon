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
			
			sb.append("Case ").append(t).append(": ").append(n - 1).append(" ");
			for(int i = n; i >= 0; i--) {
				int num = Integer.parseInt(st.nextToken());
				
				if(i == 0) {
					continue;
				}
				
				sb.append(i * num).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
