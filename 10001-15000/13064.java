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
			
			if(check(s)) {
				sb.append(s).append("\n");
			}
		}
		System.out.print(sb);
	}
	
	public static boolean check(String s) {
		if(s.length() != 8) {
			return false;
		}
		if(s.charAt(4) < 'A' || s.charAt(4) > 'Z') {
			return false;
		}
		if(s.charAt(0) != s.charAt(1)) {
			return false;
		}
		
		for(int i = 0; i < 4; i++) {
			if(s.charAt(i) < '1' || s.charAt(i) > '9') {
				return false;
			}
		}
		
		for(int i = 5; i < s.length(); i++) {
			if(s.charAt(i) < '1' || s.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
}
