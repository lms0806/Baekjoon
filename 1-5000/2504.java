import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(solve(br.readLine()));
	}
	
	public static int solve(String s) {
		Stack<Character> stack = new Stack<>();
		int sum = 0, count = 1;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == '(') {
				count *= 2;
				stack.add(c);
			}
			else if(c == '[') {
				count *= 3;
				stack.add(c);
			}
			else if(c == ')'){
				if(stack.isEmpty() || stack.peek() != '(') {
					return 0;
				}
				if(s.charAt(i - 1) == '(') {
					sum += count;
				}
				count /= 2;
				stack.pop();
			}
			else if(c == ']'){
				if(stack.isEmpty() || stack.peek() != '[') {
					return 0;
				}
				if(s.charAt(i - 1) == '[') {
					sum += count;
				}
				count /= 3;
				stack.pop();
			}
		}
		return !stack.isEmpty() ? 0 : sum;
	}
}
