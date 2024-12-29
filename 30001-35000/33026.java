import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.readLine();
		
		System.out.print(solve(br.readLine()));
	}
	
	public static int solve(String s) {
		int l = 0, o = 0;
		for(char c : s.toCharArray()) {
			if(c == 'L') {
				l++;
			}
			else {
				o++;
			}
		}
		
		int nowL = 0, nowO = 0;
		for(int i = 0; i < s.length() - 1; i++) {
			char c = s.charAt(i);
			
			if(c == 'L') {
				nowL++;
			}
			else {
				nowO++;
			}
			
			if(nowL != l - nowL && nowO != o - nowO) {
				return i + 1;
			}
		}
		
		return -1;
	}
}
