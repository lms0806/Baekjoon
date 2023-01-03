import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine()), s = Integer.parseInt(br.readLine()), h = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < t; i++) {
			sb.append("*").append(" ".repeat(s)).append("*").append(" ".repeat(s)).append("*").append("\n");
		}
		sb.append("*".repeat(s * 2 + 3)).append("\n");
		for(int i = 0; i < h; i++) {
			sb.append(" ".repeat(s + 1)).append("*").append("\n");
		}
		System.out.print(sb);
	}
}
