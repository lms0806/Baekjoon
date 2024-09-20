import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] str = br.readLine().split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(String s : str) {
			for(int i = 0; i < s.length() - 1; i += 2) {
				int num = s.charAt(i) - 'a' + s.charAt(i + 1) - 'a' + 26 - n;
				
				sb.append((char)(num % 26 + 'a'));
			}
			sb.append(" ");
		}
		System.out.print(sb);
	}
}
