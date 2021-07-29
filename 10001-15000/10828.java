import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		Stack<Integer> stack = new Stack<>();
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			char ch = s.charAt(0);
			if(ch == 'p') {
				if(s.charAt(1) == 'u') {
					stack.push(Integer.parseInt(st.nextToken()));
				}
				else {
					sb.append(stack.size() != 0 ? stack.pop() : -1).append("\n");
				}
			}
			else {
				if(ch == 't') {
					sb.append(stack.size() != 0 ? stack.get(stack.size() - 1) : -1);
				}
				else {
					sb.append(ch == 'e' ? stack.empty() ? 1 : 0 : stack.size());
				}
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}
