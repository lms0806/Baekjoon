import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine();
		
		if(s.contains("A")) {
			solve('A', s);
		}
		else if(s.contains("B")) {
			solve('B', s);
		}
		else if(s.contains("C")) {
			solve('C', s);
		}
		else {
			for(int i = 0; i < s.length(); i++) {
				sb.append("A");
			}
		}
		System.out.print(sb);
	}
	
	public static void solve(char c, String s) {
		for(char ch : s.toCharArray()) {
			sb.append(ch >= c && ch <= 'F' && ch != 'E' ? c : ch);
		}
	}
}
