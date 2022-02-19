import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int i = 1;
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			Double answer = 0.0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0 && c == 0) {
				break;
			}
			
			sb.append("Triangle #").append(i).append("\n");
			i++;
			
			if(a == -1) {
				answer = Math.sqrt(c * c - b * b);
				if(answer > 0) {
					sb.append("a = ").append(String.format("%.3f", answer));
				}
				else {
					sb.append("Impossible.");
				}
			}
			else if(b == -1) {
				answer = Math.sqrt(c * c - a * a);
				if(answer > 0) {
					sb.append("b = ").append(String.format("%.3f", answer));
				}
				else {
					sb.append("Impossible.");
				}
			}
			else {
				answer = Math.sqrt(a * a + b * b);
				if(answer > 0) {
					sb.append("c = ").append(String.format("%.3f", answer));
				}
				else {
					sb.append("Impossible.");
				}
			}
			sb.append("\n\n");
		}
		System.out.print(sb);
	}
}
