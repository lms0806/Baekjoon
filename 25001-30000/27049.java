import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(solve(br.readLine()));
	}
	
	public static String solve(String s) {
		int idx = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '?') {
				idx = i;
				break;
			}
		}
		
		for(int i = 0; i <= 10; i++) {
			int sum = 0;
			for(int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				
				if(c >= '0' && c <= '9') {
					sum += (c - '0') * (10 - j);
				}
				else if(c == '?') {
					sum += i * (10 - j);
				}
				else if(c == 'X') {
					sum += 10 * (10 - j);
				}
			}
			
			if(sum % 11 == 0) {
				if(idx < 9 && i == 10) {
					continue;
				}
				else {
					return i < 10 ? i + "" : "X";
				}
			}
		}
		return "-1";
	}
}
