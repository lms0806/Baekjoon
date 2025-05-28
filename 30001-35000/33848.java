import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		Stack<String> query = new Stack<>();
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int op = Integer.parseInt(st.nextToken());
			
			if(op == 1) {
				int num = Integer.parseInt(st.nextToken());
				
				stack.add(num);
				query.add(op + " " + num);
			}
			else if(op == 2) {
				query.add(op + " " + stack.pop());
			}
			else if(op == 3) {
				int j = Integer.parseInt(st.nextToken());
				
				while(j --> 0) {
					st = new StringTokenizer(query.pop());
					
					if(st.nextToken().equals("1")) {
						stack.pop();
					}
					else {
						stack.add(Integer.parseInt(st.nextToken()));
					}
				}
			}
			else if(op == 4) {
				sb.append(stack.size()).append("\n");
			}
			else {
				sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
			}
		}
		System.out.print(sb);
	}
}
