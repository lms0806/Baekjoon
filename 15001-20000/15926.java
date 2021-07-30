import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		Stack<Integer> stack = new Stack<>();
		br.readLine();
		
		stack.add(-1);
		
		int answer = 0;
		String s = br.readLine();
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == '(') {
				stack.add(i);
			}
			else {
				stack.pop();
				if(!stack.isEmpty()) {
					answer = Math.max(answer, i - stack.peek());
				}
				else {
					stack.add(i);
				}
			}
		}
		System.out.print(answer);
	}
}
