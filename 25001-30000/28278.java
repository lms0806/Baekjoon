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
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			if(n == 1) {
				stack.add(Integer.parseInt(st.nextToken()));
				continue;
			}
			else if(n == 2) {
				sb.append(stack.isEmpty() ? -1 : stack.pop());
			}
			else if(n == 3) {
				sb.append(stack.size());
			}
			else if(n == 4) {
				sb.append(stack.isEmpty() ? 1 : 0);
			}
			else {
				sb.append(stack.isEmpty() ? -1 : stack.peek());
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
