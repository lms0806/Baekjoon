import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long max = 0, answer = 0;
		Stack<Long> stack = new Stack<>();
		for(int i = 0; i < n; i++) {
			long num = Long.parseLong(br.readLine());
			
			if(stack.isEmpty()) {
				stack.add(num);
			}
			else {
				if(stack.peek() < num) {
					answer += num - stack.pop();
					stack.add(num);
				}
				else if(stack.peek() > num) {
					stack.pop();
					stack.add(num);
				}
			}
			
			max = Math.max(max, num);
		}
		
		while(!stack.isEmpty()) {
			answer += max - stack.pop();
		}
		System.out.print(answer);
	}
}
