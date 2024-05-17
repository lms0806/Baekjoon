import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double k = Double.parseDouble(st.nextToken()), p = Double.parseDouble(st.nextToken()), x = Double.parseDouble(st.nextToken());
		
		double min = 10000 * x + p * k;
		for(int i = 1; i <= 10000; i++) {
			min = Math.min(min, (k / i) * p + x * i);
		}
		System.out.print(String.format("%.3f", min));
	}
}
