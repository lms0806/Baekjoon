import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		String s = br.readLine();
		
		int[] alpha = new int[26];
		for(int i = 0; i < s.length(); i++) {
			alpha[s.charAt(i) - 'a']++;
		}
		
		if(s.length() % 2 == 1) {
			alpha[s.charAt(s.length() / 2) - 'a']--;
		}
		
		System.out.print(solve(alpha));
	}
	
	public static String solve(int[] alpha) {
		for(int i = 0; i < 26; i++) {
			if(alpha[i] % 2 == 1) {
				return "No";
			}
		}
		return "Yes";
	}
}
