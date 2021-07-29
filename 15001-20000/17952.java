import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		Stack<Integer> stack = new Stack<>(), stack1 = new Stack<>();
		
		int size = Integer.parseInt(br.readLine());
		
		int answer = 0;
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			if(st.nextToken().equals("1")) {
				stack1.add(Integer.parseInt(st.nextToken()));
				stack.add(Integer.parseInt(st.nextToken()) - 1);
			}
			else {
				if(!stack.isEmpty()) {
					stack.add(stack.pop() - 1);
				}
			}
			
			if(!stack.isEmpty() && stack.peek() == 0) {
				stack.pop();
				answer += stack1.pop();
			}
		}
		System.out.print(answer);
	}
}
