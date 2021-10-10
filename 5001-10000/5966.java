import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			st.nextToken();
			sb.append(solve(st.nextToken())).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(String s) {
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()) {
			if(c == '<') {
				if(stack.isEmpty()) {
					return "illegal";
				}
				else {
					stack.pop();
				}
			}
			else {
				stack.add(c);
			}
		}
		return stack.isEmpty() ? "legal" : "illegal";
	}
}
