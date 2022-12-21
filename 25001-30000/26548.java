import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double a = Double.parseDouble(st.nextToken()), b = Double.parseDouble(st.nextToken()), c = Double.parseDouble(st.nextToken());
			
			double answer = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			double answer1 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			
			sb.append(String.format("%.3f", answer)).append(", ").append(String.format("%.3f", answer1)).append("\n");
		}
		System.out.print(sb);
	}
}
