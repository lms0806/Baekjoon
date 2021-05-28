import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		Stack<Character> stack = new Stack<>();
		
		int answer = 0;
		while(size --> 0) {
			String str = br.readLine();
			for(char ch : str.toCharArray()) {
				if(stack.isEmpty() || stack.peek() != ch) {
					stack.add(ch);
				}
				else {
					stack.pop();
				}
			}
			
			if(stack.isEmpty()) {
				answer++;
			}
			stack.clear();
		}
		System.out.print(answer);
	}
}
