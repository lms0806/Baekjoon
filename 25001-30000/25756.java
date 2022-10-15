import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double answer = 0;
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			double num = Double.parseDouble(st.nextToken());
			answer = answer + num - (answer * (num / 100.0));
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
