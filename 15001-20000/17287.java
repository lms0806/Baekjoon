import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int answer = 0;
		int a = 0, b = 0, c = 0;
		for(char ch : br.readLine().toCharArray()) {
			if(ch == '(') {
				a++;
			}
			else if(ch == ')') {
				a--;
			}
			else if(ch == '{') {
				b++;
			}
			else if(ch == '}'){
				b--;
			}
			else if(ch == '[') {
				c++;
			}
			else if(ch == ']') {
				c--;
			}
			else {
				answer = Math.max(answer, a + b * 2 + c * 3);
			}
		}
		System.out.print(answer);
	}
}
