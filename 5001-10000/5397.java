import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			Stack<Character> stack = new Stack<>(), stack1 = new Stack<>();
			
			for(char ch : br.readLine().toCharArray()) {
				if(ch == '<') {
					if(!stack.isEmpty()) {
						stack1.add(stack.pop());
					}
				}
				else if(ch == '>') {
					if(!stack1.isEmpty()) {
						stack.add(stack1.pop());
					}
				}
				else if(ch == '-') {
					if(!stack.isEmpty()) {
						stack.pop();
					}
				}
				else {
					stack.add(ch);
				}
			}
			
			while(!stack1.isEmpty()) {
				stack.add(stack1.pop());
			}
			
			StringBuilder sb2 = new StringBuilder();
			while(!stack.isEmpty()) {
				sb2.append(stack.pop());
			}
			sb.append(sb2.reverse()).append("\n");
		}
		System.out.print(sb);
	}
}
