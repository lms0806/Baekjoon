import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		double x = Double.parseDouble(st.nextToken()), y = Double.parseDouble(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		while(n --> 0) {
			sb.append((int)(Integer.parseInt(br.readLine()) / x * y)).append("\n");
		}
		System.out.print(sb);
	}
}
