import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = 1;
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n < 0) {
				break;
			}
			
			double x = 0, y = 0, m = 0;
			while(n --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
				
				x += a * c;
				y += b * c;
				m += c;
			}
			br.readLine();
			
			sb.append("Case ").append(t++).append(": ").append(print(x / m)).append(" ").append(print(y / m)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String print(double n) {
		return String.format("%.2f", n);
	}
}
