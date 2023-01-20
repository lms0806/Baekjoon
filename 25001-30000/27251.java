import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			if(i * i > 100) {
				sb.append("*".repeat(100)).append("...");
			}
			else {
				sb.append("*".repeat(i * i));
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
