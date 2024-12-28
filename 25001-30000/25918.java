import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.readLine();
		String s = br.readLine();
		
		System.out.print(solve(s));
	}
	
	public static int solve(String s) {
		if(s.length() % 2 == 1) {
			return -1;
		}
		
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()) {
			if(stack.isEmpty()) {
				stack.add(c);
			}
			else {
				if(c == '(') {
					if(stack.peek() == ')') {
						stack.pop();
					}
					else {
						stack.add(c);
					}
				}
				else {
					if(stack.peek() == '(') {
						stack.pop();
					}
					else {
						stack.add(c);
					}
				}
			}
			
			answer = Math.max(answer, stack.size());
		}
		return !stack.isEmpty() ? -1 : answer;
	}
}
