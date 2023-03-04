import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		if(k < m + n - 1) {
			System.out.print("NO");
		}
		else {
			StringBuilder sb = new StringBuilder();
			sb.append("YES").append("\n");
			for(int i = 1; i <= n; i++) {
				for(int j = 0; j < m; j++) {
					sb.append(i + j).append(" ");
				}
				sb.append("\n");
			}
			System.out.print(sb);
		}
	}
}
