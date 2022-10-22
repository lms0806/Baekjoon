import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("#")) {
				break;
			}
			
			Stack<Character> stack = new Stack<>();
			for(char c : s.toCharArray()) {
				if(c == '(' || c == '[' || c == '{') {
					stack.add(c);
				}
				else if(c == ')') {
					if(stack.peek() == '(') {
						stack.pop();
					}
					else {
						break;
					}
				}
				else if(c == ']') {
					if(stack.peek() == '[') {
						stack.pop();
					}
					else {
						break;
					}
				}
				else if(c == '}') {
					if(stack.peek() == '{') {
						stack.pop();
					}
					else {
						break;
					}
				}
			}
			sb.append(stack.isEmpty() ? "Legal" : "Illegal").append("\n");
		}
		System.out.print(sb);
	}
}
