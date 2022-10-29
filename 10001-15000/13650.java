import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		StringBuilder sb = new StringBuilder();
		while((s = br.readLine()) != null) {
			int n = Integer.parseInt(s);
			
			Stack<Character>[] stack = new Stack[31];
			for(int i = 0; i < stack.length; i++) {
				stack[i] = new Stack<>();
			}
			
			int answer = 0;
			while(n --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				int size = Integer.parseInt(st.nextToken()) - 30;
				char c = st.nextToken().charAt(0);

				if(!stack[size].isEmpty() && stack[size].peek() != c) {
					answer++;
					stack[size].pop();
				}
				else {
					stack[size].add(c);
				}
			}
			
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
