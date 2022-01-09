import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while (t --> 0) {
			int a = Integer.parseInt(br.readLine());
			
			sb.append(a / 25).append(" ");
			
			a %= 25;
			
			sb.append(a / 10).append(" ");
			
			a %= 10;
			
			sb.append(a / 5).append(" ");
			
			a %= 5;
			
			sb.append(a).append("\n");
		}
		System.out.print(sb);
	}
}
