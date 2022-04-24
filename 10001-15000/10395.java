import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		System.out.print(solve(br.readLine(), br.readLine()));
	}
	
	public static char solve(String s, String s1) {
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i), c1 = s1.charAt(i);
			
			if(c == ' ') {
				continue;
			}
			
			if(c == c1 && (c == '1' || c == '0')) {
				return 'N';
			}
		}
		return 'Y';
	}
}
