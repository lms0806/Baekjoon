import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		Stack<Character> stack = new Stack<>();
		
		int answer = 0;
		for(char ch : str.toCharArray()) {
			if(ch == '(') {
				stack.add(ch);
			}
			else {
				if(!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				}
				else {
					answer++;
				}
			}
		}
		System.out.print(answer + stack.size());
	}
}
