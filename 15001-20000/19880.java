import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.print(solve(br.readLine()));
	}
	
	public static int solve(String s) {
		if(s.charAt(0) == '0' || s.length() == 1) {
			return 0;
		}
		
		int answer = 0;
		for(int i = 1; i < s.length() / 2 + 1; i++) {
			String s1 = s.substring(0, i), s2 = s.substring(i);
			
			if(s2.charAt(0) == '0') {
				continue;
			}
			if(s1.length() < s2.length()) {
				answer++;
			}
			else if(s1.length() == s2.length()){
				for(int j = 0; j < s1.length();) {
					if(s1.charAt(j) > s2.charAt(j)) {
						break;
					}
					answer++;
					break;
				}
			}
		}
		return answer;
	}
}
