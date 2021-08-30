import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		Stack<String> stack = new Stack<>();
		for(char ch : br.readLine().toCharArray()) {
			if(ch != ')') {
				stack.add(ch + "");
			}
			else {
				int count = 0;
				while(!stack.peek().equals("(")) {
					count += stack.pop().equals("*") ? Integer.parseInt(stack.pop()) : 1;
				}
				stack.pop();
				
				stack.push(String.valueOf(count * Integer.parseInt(stack.pop())));
				stack.push("*");
			}
		}
		
		long answer = 0;
		while(!stack.isEmpty()) {
			answer += stack.pop().equals("*") ? Integer.parseInt(stack.pop()) : 1;
		}
		
		System.out.print(answer);
	}
}
