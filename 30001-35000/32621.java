import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(solve(br.readLine()));
	}
	
	public static String solve(String str) {
		if(str.length() < 3 || !str.contains("+")) {
			return "No Money";
		}
		
		String[] s = str.split("\\+");
		
		return !check(s[0]) || !check(s[1]) || s[0].startsWith("0") || s[1].startsWith("0") || !s[0].equals(s[1]) ? "No Money" : "CUTE";
	}
	
	public static boolean check(String s) {
		for(char c : s.toCharArray()) {
			if(('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) {
				return false;
			}
		}
		return true;
	}
}
