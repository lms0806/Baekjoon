import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(n --> 0) {
			String s = br.readLine();
			
			long result = 0, count = 1;
			for(int i = 23; i >= 0; i--) {
				result += (s.charAt(i) - '0') * count;
				count *= 2;
			}
			sb.append(result).append("\n");
		}
		System.out.print(sb);
	}
}
