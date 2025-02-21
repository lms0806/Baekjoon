import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			sb.append("YES\n");
			for(int i = 1; i <= n; i++) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
