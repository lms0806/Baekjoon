import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Deque<Character> dq = new ArrayDeque<>();
		Stack<Integer> stack = new Stack<>();
		
		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int choice = Integer.parseInt(st.nextToken());
			
			if(choice == 3) {
				if(!dq.isEmpty()) {
					if(stack.peek() == 1) {
						dq.pollLast();
					}
					else {
						dq.pollFirst();
					}
					
					stack.pop();
				}
			}
			else {
				char c = st.nextToken().charAt(0);
				if(choice == 1) {
					dq.addLast(c);
				}
				else {
					dq.addFirst(c);
				}
				stack.add(choice);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(!dq.isEmpty()) {
			sb.append(dq.poll());
		}
		System.out.print(sb.length() == 0 ? 0 : sb);
	}
}
