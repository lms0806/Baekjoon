import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("#")) {
				break;
			}
			
			int n = s.charAt(s.length() - 1) - 'A';
			
			for(int i = 0; i < s.length() - 1; i++) {
				char c = s.charAt(i);
				
				if(c >= 'A' && c <= 'Z') {
					c -= n;
					
					if(c < 'A') {
						c += 26;
					}
				}
				else if(c >= 'a' && c <= 'z') {
					c -= n;
					
					if(c < 'a') {
						c += 26;
					}
				}
				
				sb.append(c);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
