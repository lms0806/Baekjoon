import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = solve(br.readLine()), b = solve(br.readLine());
		
		System.out.print(a.isBlank() || b.isBlank() ? "no such exercise" : a + b);
	}
	
	public static String solve(String s) {
		StringBuilder sb = new StringBuilder();
		boolean flag = false;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(flag && !check(c)) {
				break;
			}
			
			sb.append(c);
			
			if(check(c)) {
				flag = true;
				if(i == s.length() - 1) {
					return "";
				}
			}
		}
		return !flag ? "" : sb.toString();
	}
	
	public static boolean check(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
}
