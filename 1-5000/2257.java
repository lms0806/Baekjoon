import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> stack = new Stack<>();
		stack.add(0);
		
		int num = 0;
		for(char ch : br.readLine().toCharArray()) {
			if(ch == '(') {
				stack.add(0);
			}
			else if(ch == ')') {
				num = stack.pop();
				stack.add(stack.pop() + num);
			}
			else if(ch >= '2' && ch <= '9') {
				stack.add(stack.pop() + num * (ch - '0' - 1));
			}
			else {
				num = ch == 'H' ? 1 : ch == 'C' ? 12 : 16;

				stack.add(stack.pop() + num);
			}
		}
		System.out.print(stack.pop());
	}
}
