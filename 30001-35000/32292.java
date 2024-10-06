import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			br.readLine();
			
			Stack<Character> stack = new Stack<>();
			for(char ch : br.readLine().toCharArray()) {
				stack.add(ch);
				solve(stack);
			}
			
			StringBuilder sbs = new StringBuilder();
			while(!stack.isEmpty()) {
				sbs.append(stack.pop());
			}
			sb.append(sbs.reverse()).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void solve(Stack<Character> stack) {
		if(stack.size() < 3) {
			return;
		}
		
		char c = stack.pop(), b = stack.pop(), a = stack.pop();
		if(a == 'A' && b == 'B' && c == 'B') {
			stack.add('B');
			solve(stack);
			stack.add('A');
		}
		else {
			stack.add(a);
			stack.add(b);
			stack.add(c);
		}
	}
}
