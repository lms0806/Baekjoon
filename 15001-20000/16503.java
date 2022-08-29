import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static String[] s;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		s = br.readLine().split(" ");
		
		int a = solve(true), b = solve(false);
		
		StringBuilder sb = new StringBuilder();
		sb.append(Math.min(a, b)).append("\n").append(Math.max(a, b));
		System.out.print(sb);
	}
	
	public static int solve(boolean flag) {
		if(flag) {
			int result = math(s[1].charAt(0), change(s[0]), change(s[2]));
			return math(s[3].charAt(0), result, change(s[4]));
		}
		int result = math(s[3].charAt(0), change(s[2]), change(s[4]));
		return math(s[1].charAt(0), change(s[0]), result);
	}
	
	public static int change(String s) {
		return Integer.parseInt(s);
	}
	
	public static int math(char ch, int a, int b) {
		if(ch == '+') {
			return a + b;
		}
		else if(ch == '-') {
			return a - b;
		}
		else if(ch == '*') {
			return a * b;
		}
		return a / b;
	}
}
