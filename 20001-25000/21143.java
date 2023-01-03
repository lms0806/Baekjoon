import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(solve(br.readLine()));
	}
	
	public static int solve(String s) {
		boolean[] alpha = new boolean[26];
		for(char c : s.toCharArray()) {
			if(alpha[c - 'a']) {
				return 0;
			}
			alpha[c - 'a'] = true;
		}
		return 1;
	}
}
