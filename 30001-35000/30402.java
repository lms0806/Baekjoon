import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static String answer;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i = 0; i < 15; i++) {
			
			if(solve(br.readLine())) {
				break;
			}
		}
		System.out.print(answer);
	}
	
	public static boolean solve(String s) {
		for(char c : s.toCharArray()) {
			if(c == 'w') {
				answer = "chunbae";
				return true;
			}
			else if(c == 'b') {
				answer = "nabi";
				return true;
			}
			else if(c == 'g') {
				answer = "yeongcheol";
				return true;
			}
		}
		return false;
	}
}
