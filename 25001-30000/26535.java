import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if((int)Math.sqrt(n) == Math.sqrt(n)) {
			n = (int)Math.sqrt(n);
		}
		else {
			n = (int)Math.sqrt(n) + 1;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("x".repeat(n + 2)).append("\n");
		for(int i = 0; i < n; i++) {
			sb.append("x").append(".".repeat(n)).append("x").append("\n");
		}
		sb.append("x".repeat(n + 2));
		
		System.out.print(sb);
	}
}
