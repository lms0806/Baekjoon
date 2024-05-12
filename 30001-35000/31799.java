import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		String s = br.readLine();
		
		char before = 'E';
		boolean plus = false, minus = false;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == '+' || c == '-' || c == '0') {
				continue;
			}
			
			if(c == 'C') {
				sb.append('B');
			}
			else if((c == 'B' && i < s.length() - 1 && s.charAt(i + 1) == '+') || (c == 'A' && i < s.length() - 1 && s.charAt(i + 1) == '-')) {
				if(before == 'A' || (before == 'B' && plus)) {
					sb.append('D');
				}
				else {
					sb.append('P');
				}
			}
			else if(c == 'B') {
				if(before == 'A' || before == 'B') {
					sb.append('B');
				}
				else {
					sb.append('D');
				}
			}
			else if(c == 'A' && i < s.length() - 1 && s.charAt(i + 1) == '+') {
				sb.append('E');
			}
			else if(c == 'A') {
				if(before == 'A' && !minus) {
					sb.append('P');
				}
				else {
					sb.append('E');
				}
			}
			
			if(i < s.length() - 1) {
				if(s.charAt(i + 1) == '+') {
					plus = true;
					minus = false;
				}
				else if(s.charAt(i + 1) == '-') {
					plus = false;
					minus = true;
				}
				else {
					plus = false;
					minus = false;
				}
			}
			
			before = c;
		}
		System.out.print(sb);
	}
}
