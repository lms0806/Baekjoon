import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < n; i += 2) {
			sb.append("*".repeat(i)).append(" ".repeat((2 * n - 2 * i))).append("*".repeat(i)).append("\n");
		}
		for(int i = n; i >= 0; i -= 2) {
			sb.append("*".repeat(i)).append(" ".repeat((2 * n - 2 * i))).append("*".repeat(i)).append("\n");
		}
		System.out.print(sb);
	}
}
