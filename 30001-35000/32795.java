import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			boolean[] alpha = new boolean[26];
			for(char c : br.readLine().toCharArray()) {
				alpha[c - 'a'] = true;
			}
			
			sb.append(solve(alpha, br.readLine())).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(boolean[] alpha, String s) {
		for(char c : s.toCharArray()) {
			if(!alpha[c - 'a']) {
				return "NO";
			}
		}
		return "YES";
	}
}
