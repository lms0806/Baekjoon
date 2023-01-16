import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		
		int a = 0, b = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != '0') {
				a = i;
				break;
			}
		}
		for(int i = s.length() - 1; i >= 0; i--) {
			if(s.charAt(i) != '0') {
				b = i;
				break;
			}
		}
		
		int answer = 0;
		for(int i = a; i <= b; i++) {
			if(s.charAt(i) == '0') {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
