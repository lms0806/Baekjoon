import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double t = Double.parseDouble(st.nextToken()), p = Double.parseDouble(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		if(p >= 20) {
			double n = t / (100 - p);
			sb.append((p - 20) * n + (40 * n));
		}
		else {
			sb.append(t / ((20 - p) * 2 + 80) * 2 * p);
		}
		System.out.print(sb);
	}
}
