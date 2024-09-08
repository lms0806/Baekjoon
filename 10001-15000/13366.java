import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(n --> 0) {
			int sum = 0;
			for(char c : br.readLine().toCharArray()) {
				sum += c - '0';
			}
			
			sb.append(sum % 9 == 0 ? "YES" : "NO").append("\n");
		}
		System.out.print(sb);
	}
}
