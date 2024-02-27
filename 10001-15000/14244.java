import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m - 1; i++) {
			sb.append(i).append(" ").append(m - 1).append("\n");
		}
		for(int i = m - 1; i < n - 1; i++) {
			sb.append(i).append(" ").append(i + 1).append("\n");
		}
		System.out.print(sb);
	}
}
