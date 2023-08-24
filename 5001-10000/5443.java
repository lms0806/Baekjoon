import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String str = br.readLine();
			
			if(!check_digit(str)) {
				sb.append("no").append("\n");
				continue;
			}
			
			String[] s = str.split(" ");
			
			int a = Integer.parseInt(s[0]), b = Integer.parseInt(s[1]);
			int c = Integer.parseInt(s[2].substring(0, 2)), d = Integer.parseInt(s[2].substring(2));
			
			sb.append(check(a, b, c, d) ? "yes" : "no").append("\n");
		}
		System.out.print(sb);
	}
	
	public static boolean check(int a, int b, int c, int d) {
		if(a + b + c == d || a + b + d == c || a + c + d == b || b + c + d == a) {
			return true;
		}
		else if(a + b == c + d || a + c == b + d || a + d == b + c) {
			return true;
		}
		return false;
	}
	
	public static boolean check_digit(String s) {
		int[] alpha = new int[10];
		for(char c : s.toCharArray()) {
			if(c == ' ') {
				continue;
			}
			
			alpha[c - '0']++;
		}
		
		for(int i = 0; i < 10; i++) {
			if(alpha[i] != 0 && alpha[i] != alpha[s.charAt(0) - '0']) {
				return false;
			}
		}
		return true;
	}
}
