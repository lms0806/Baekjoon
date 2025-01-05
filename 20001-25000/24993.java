import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[] check = new boolean[26];
		String[] s = new String[n];
		
		for(int i = 0; i < n; i++) {
			s[i] = br.readLine();
			
			check[s[i].charAt(0) - 'A'] = true;
		}
		System.out.print(solve(s, check));
	}
	
	public static char solve(String[] s, boolean[] check) {
		for(int i = 0; i < s.length; i++) {
			boolean flag = true;
			for(char c : s[i].toCharArray()) {
				if(!check[c - 'A']) {
					flag = false;
				}
			}
			
			if(flag) {
				return 'Y';
			}
		}
		return 'N';
	}
}
