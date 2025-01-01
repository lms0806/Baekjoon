import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		double answer = 0;
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			double a = Double.parseDouble(st.nextToken()), d = Double.parseDouble(st.nextToken());
			
			answer += d * Math.sin(a * Math.PI / 180);
		}
		System.out.print(String.format("%.2f", answer));
	}
}
