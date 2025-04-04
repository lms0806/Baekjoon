import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == '(') {
				stack.push(-1);
			}
			else if(c == ')') {
				int num = 0;
				while(!stack.isEmpty() && stack.peek() != -1) {
					num += stack.pop();
				}
				stack.pop();
				
				if(i < s.length() - 1 && '0' <= s.charAt(i + 1) && s.charAt(i + 1) <= '9') {
					num *= (s.charAt(i + 1) - '0');
					i++;
				}
				stack.add(num);
			}
			else {
				int num = c == 'H' ? 1 : c == 'C' ? 12 : 16;
				
				if(i < s.length() - 1 && '0' <= s.charAt(i + 1) && s.charAt(i + 1) <= '9') {
					num *= (s.charAt(i + 1) - '0');
					i++;
				}
				stack.add(num);
			}
		}
		
		int answer = 0;
		while(!stack.isEmpty()) {
			answer += stack.pop();
		}
		System.out.print(answer);
	}
}
