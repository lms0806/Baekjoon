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
			
			double a = Double.parseDouble(st.nextToken()), b = Double.parseDouble(st.nextToken());
			
			sb.append(Math.abs(a / b - n) <= 0.001 ? "golden" : "not").append("\n");
		}
		System.out.print(sb);
	}
}
