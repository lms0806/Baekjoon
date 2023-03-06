import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		sb.append("*".repeat(n)).append(" ".repeat(n * 2 - 3)).append("*".repeat(n)).append("\n");
		for(int i = 0; i < n - 2; i++) {
			sb.append(" ".repeat(i + 1)).append("*").append(" ".repeat(n - 2)).append("*").append(" ".repeat((n - 2 - i) * 2  - 1)).append("*").append(" ".repeat(n - 2)).append("*").append("\n");
		}
		sb.append(" ".repeat(n - 1)).append("*").append(" ".repeat(n - 2)).append("*").append(" ".repeat(n - 2)).append("*").append("\n");
		for(int i = n - 3; i >= 0; i--) {
			sb.append(" ".repeat(i + 1)).append("*").append(" ".repeat(n - 2)).append("*").append(" ".repeat((n - 2 - i) * 2  - 1)).append("*").append(" ".repeat(n - 2)).append("*").append("\n");
		}
		sb.append("*".repeat(n)).append(" ".repeat(n * 2 - 3)).append("*".repeat(n)).append("\n");
		System.out.print(sb);
	}
}
