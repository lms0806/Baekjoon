import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		Stack<Character> stack = new Stack<>();
		
		StringBuilder sb = new StringBuilder();
		for(char ch : br.readLine().toCharArray()) {
			if(ch >= 'A' && ch <= 'Z') {
				sb.append(ch);
			}
			else if(ch == '*' || ch == '/') {
				while(!stack.empty() && (stack.peek() == '*' || stack.peek() == '/')) {
					sb.append(stack.pop());
				}
				stack.add(ch);
			}
			else if(ch == '+' || ch == '-') {
				while(!stack.empty() && (stack.peek() == '*' || stack.peek() == '/' || stack.peek() == '+' || stack.peek() == '-')) {
					sb.append(stack.pop());
				}
				stack.add(ch);
			}
			else if(ch == '(') {
				stack.add(ch);
			}
			else if(ch == ')') {
				while(stack.peek() != '(') {
					sb.append(stack.pop());
				}
				stack.pop();
			}
		}
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.print(sb);
	}
}
