import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		int a = 0, b = 0, c = 0;
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a += Integer.parseInt(st.nextToken());
			b += Integer.parseInt(st.nextToken());
			c += Integer.parseInt(st.nextToken());
			
			int min = Math.min(a, Math.min(b, c));
			
			sb.append(min < 30 ? "NO" : min);
			if(min >= 30) {
				a -= min;
				b -= min;
				c -= min;
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
