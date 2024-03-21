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
			
			long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken()), c = Long.parseLong(st.nextToken());
			
			long max = Math.max(a, Math.max(b, c));
			long sum = max == a ? b + c : max == b ? a + c : a + b;
			
			sb.append(max * max + sum * sum).append("\n");
		}
		System.out.print(sb);
	}
}
