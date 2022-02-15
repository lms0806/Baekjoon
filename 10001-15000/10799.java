import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stack = new Stack<>();
		char[] c = br.readLine().toCharArray();
		
		int answer = 0;
		for(int i = 0; i < c.length; i++) {
			if(c[i] == '(') {
				stack.add(c[i]);
			}
			else {
				stack.pop();
				if(c[i - 1] == '(') {
					answer += stack.size();
				}
				else {
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
}
