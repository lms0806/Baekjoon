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
			long n = Long.parseLong(st.nextToken()), m = Long.parseLong(st.nextToken());
			
			sb.append(n == 1 || m == 1 || ((n + m) & 1) != 0 ? "YES" : "NO").append("\n");
		}
		System.out.print(sb);
	}
}
