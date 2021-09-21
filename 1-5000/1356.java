import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(solve(br.readLine()));
	}
	
	public static String solve(String s) {
		for(int i = 1; i < s.length(); i++) {
			int a = 1, b = 1;
			
			for(int j = 0; j < i; j++) {
				a *= s.charAt(j) - '0';
			}
			for(int j = i; j < s.length(); j++) {
				b *= s.charAt(j) - '0';
			}
			
			if(a == b) {
				return "YES";
			}
		}
		return "NO";
	}
}
