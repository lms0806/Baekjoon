import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String s = br.readLine();
			
			if(s.length() == 1) {
				sb.append(s);
			}
			else {
				sb.append(s).append("\n");
				for(int i = 1; i < s.length() - 1; i++) {
					sb.append(s.charAt(i)).append(" ".repeat(s.length() - 2)).append(s.charAt(s.length() - i - 1)).append("\n");
				}
				sb.append(new StringBuilder(s).reverse());
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
