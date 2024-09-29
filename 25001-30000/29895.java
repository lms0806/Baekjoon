import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			sb.append((n - i + 1) * i).append("\n");
		}
		System.out.print(sb);
	}
}
