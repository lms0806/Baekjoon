import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			br.readLine();
			String s = br.readLine();
			
			boolean upper = false, lower = false, digit = false, special = false;
			for(char c : s.toCharArray()) {
				if(c >= 'A' && c <= 'Z') {
					upper = true;
				}
				else if(c >= 'a' && c <= 'z') {
					lower = true;
				}
				else if(c >= '0' && c <= '9') {
					digit = true;
				}
				else if(c == '#' || c == '@' || c == '*' || c == '&') {
					special = true;
				}
			}
			
			if(!upper) {
				s += "A";
			}
			if(!lower) {
				s += "a";
			}
			if(!digit) {
				s += "1";
			}
			if(!special) {
				s += "#";
			}
			
			sb.append("Case #").append(i).append(": ").append(s.length() < 7 ? s + "1".repeat(7 - s.length()) : s).append("\n");
		}
		System.out.print(sb);
	}
}
