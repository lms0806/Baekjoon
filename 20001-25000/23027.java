import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		if(s.contains("A")) {
			solve('A', s, sb);
		}
		else if(s.contains("B")) {
			solve('B', s, sb);
		}
		else if(s.contains("C")) {
			solve('C', s, sb);
		}
		else {
			for(int i = 0; i < s.length(); i++) {
				sb.append("A");
			}
		}
		System.out.print(sb);
	}
	
	public static void solve(char c, String s, StringBuilder sb) {
		for(char ch : s.toCharArray()) {
			if(ch >= c && ch <= 'F' && ch != 'E') {
				sb.append(c);
			}
			else {
				sb.append(ch);
			}
		}
	}
}
