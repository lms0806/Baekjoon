import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		Stack<Integer> stack = new Stack<>();
		
		for(char ch : br.readLine().toCharArray()) {
			if(ch >= '0' && ch <= '9') {
				stack.add(ch - '0');
			}
			else {
				int a = stack.pop(), b = stack.pop();
				stack.add(ch == '*' ? a * b : ch == '+' ? a + b : ch == '/' ? b / a : b - a);
			}
		}
		System.out.print(stack.get(0));
	}
}
