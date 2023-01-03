import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		String a = s.substring(0, s.length() / 3);
		String b = s.substring(s.length() / 3, s.length() / 3 * 2);
		String c = s.substring(s.length() / 3 * 2);
		
		System.out.println(solve(a, b, c));
	}
	
	public static String solve(String a, String b, String c) {
		if(a.equals(b) || a.equals(c)) {
			return a;
		}
		return b;
	}
}
