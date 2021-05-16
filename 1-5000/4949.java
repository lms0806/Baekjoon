import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = "";
		StringBuilder sb = new StringBuilder();
		while(!(str = br.readLine()).equals(".")) {
			sb.append(solution(str));
		}
		System.out.print(sb);
	}
	
	public static String solution(String str) {
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == '(' || ch == '[') {
				stack.push(ch);
			}
			else if(ch == ')') {
				if(stack.isEmpty() || stack.peek() != '(') {
					return "no\n";
				}
				stack.pop();
			}
			else if(ch == ']') {
				if(stack.isEmpty() || stack.peek() != '[') {
					return "no\n";
				}
				stack.pop();
			}
		}
		
		return stack.isEmpty() ? "yes\n" : "no\n";
	}
}
