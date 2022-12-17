import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double[] num = {350.34, 230.9, 190.55, 125.3, 180.9};
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			double sum = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < 5; i++) {
				sum += num[i] * Integer.parseInt(st.nextToken());
			}
			
			sb.append("$").append(String.format("%.2f", sum)).append("\n");
		}
		System.out.print(sb);
	}
}
