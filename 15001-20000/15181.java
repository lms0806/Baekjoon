import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("#")) {
				break;
			}
			
			sb.append(solve(s)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(String s) {
		if(s.length() == 1) {
			return "That music is beautiful.";
		}
		
		for(int i = 1; i < s.length(); i++) {
			if(!check(s.charAt(i - 1), s.charAt(i))) {
				return "Ouch! That hurts my ears.";
			}
		}
		return "That music is beautiful.";
	}
	
	public static boolean check(char a, char b) {
		if(b - a == 2 || b - a == 4 || b - a == 6) {
			return true;
		}
		if(a - b == 5 || a - b == 3 || a - b == 1) {
			return true;
		}
		return false;
	}
}
