import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.print(solve(Integer.parseInt(br.readLine()), br.readLine(), br.readLine()));
	}
	
	public static String solve(int n, String s, String s1) {
		if(s.charAt(0) != s1.charAt(0) || s.charAt(n - 1) != s1.charAt(n - 1)) {
			return "NO";
		}
	
		int[] alpha = new int[26];
		
		for(char c : s.toCharArray()) {
			alpha[c - 'a']++;
		}
		for(char c : s1.toCharArray()) {
			alpha[c - 'a']--;
		}
		
		for(int i = 0; i < alpha.length; i++) {
			if(alpha[i] != 0) {
				return "NO";
			}
		}
		
		s = s.replaceAll("a|e|i|o|u", "");
		s1 = s1.replaceAll("a|e|i|o|u", "");
		
		if(!s.equals(s1)) {
			return "NO";
		}
		
		return "YES";
	}
}
