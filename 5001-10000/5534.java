import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		
		int answer = 0;
		while(n --> 0) {
			answer += solve(s, br.readLine());
		}
		System.out.print(answer);
	}
	
	public static int solve(String s, String str) {
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == s.charAt(0)) {
				for(int j = i + 1; j < str.length(); j++) {
					if(str.charAt(j) == s.charAt(1)) {
						int idx = 0;
						for(int k = i; k < str.length(); k += j - i) {
							if(str.charAt(k) != s.charAt(idx)) {
								break;
							}
							
							idx++;
							
							if(idx == s.length()) {
								return 1;
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
