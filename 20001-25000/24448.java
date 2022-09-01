import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Stack<String> stack = new Stack<>();
		
		StringBuilder sb = new StringBuilder();
		while(n --> 0) {
			String s = br.readLine();
			
			if(s.equals("READ")) {
				sb.append(stack.pop()).append("\n");
			}
			else {
				stack.add(s);
			}
		}
		System.out.print(sb);
	}
}
