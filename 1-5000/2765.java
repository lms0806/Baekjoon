import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			double a = Double.parseDouble(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			double c = Double.parseDouble(st.nextToken());
			
			if(b == 0) {
				break;
			}
			
			double distance = a / 63360 * 3.1415927 * b;
			double answer = distance / (c / 3600);
			
			sb.append("Trip #").append(i).append(": ").append(String.format("%.2f", distance)).append(" ").append(String.format("%.2f", answer)).append("\n");
		}
		System.out.print(sb);
	}
}
