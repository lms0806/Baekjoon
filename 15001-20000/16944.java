import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		String s = br.readLine();
		
		boolean num = false, upper = false, lower = false, special = false;
		
		for(char c : s.toCharArray()) {
			if(c >= '0' && c <= '9') {
				num = true;
			}
			else if(c >= 'A' && c <= 'Z') {
				upper = true;
			}
			else if(c >= 'a' && c <= 'z') {
				lower = true;
			}
			else if("!@#$%^&*()-+".contains(c + "")) {
				special = true;
			}
		}
		
		int answer = 0;
		if(!num) {
			answer++;
		}
		if(!upper) {
			answer++;
		}
		if(!lower) {
			answer++;
		}
		if(!special) {
			answer++;
		}
		if(s.length() + answer < 6) {
			answer = 6 - s.length();
		}
		
		System.out.print(answer);
	}
}
