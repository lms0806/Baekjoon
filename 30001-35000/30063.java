import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		System.out.print(solve(br.readLine()));
	}
	
	public static int solve(String s) {
		
		int[] c = new int[26];
		
		int answer = 0;
		for(int i = 0; i < s.length(); i++) {
			c[s.charAt(i) - 'A']++;
			
			if(c[0] >= 2 && c[10] >= 1 && c[17] >= 1 && c[18] >= 1 && c[19] >= 1) {
				return i + 1;
			}
		}
		return answer;
	}
}
