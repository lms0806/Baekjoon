import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		double n = 1.61803399;
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			double p = Double.parseDouble(st.nextToken()), q = Double.parseDouble(st.nextToken());
			
			double answer = p * q / (p + q);
			
			sb.append("f = ").append(String.format("%.1f", answer)).append("\n");
		}
		System.out.print(sb);
	}
}
