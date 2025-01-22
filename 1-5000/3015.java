import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		long answer = 0;
		Stack<Node> stack = new Stack<>();
		while(t --> 0) {
			int num = Integer.parseInt(br.readLine());
			int count = 1;
			
			while(!stack.isEmpty() && stack.peek().height < num) {
				answer += stack.pop().count;
			}
			
			if(!stack.isEmpty()) {
				if(stack.peek().height == num) {
					if(stack.size() > 1) {
						answer++;
					}
					
					answer += stack.peek().count;
					count = stack.peek().count + 1;
					stack.pop();
				}
				else {
					answer++;
				}
			}
			
			stack.add(new Node(num, count));
		}
		System.out.print(answer);
	}
}

class Node {
	int height, count;
	
	public Node(int height, int count) {
		this.height = height;
		this.count = count;
	}
}
