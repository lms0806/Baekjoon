import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			int result = 0;
			for(int i = 1; i <= n; i++) {
				result += i * W(i + 1);
			}
			sb.append(result).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int W(int n) {
		return n * (n + 1) / 2;
	}
}
