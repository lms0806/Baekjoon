import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine().trim());
		
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			int c = s.charAt(i) - (3 * (i + 1) + n);
			
			while(c < 'A') {
				c += 26;
			}
			
			sb.append((char)c);
		}
		System.out.print(sb);
	}
}
