import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stack = new Stack<>();
		
		boolean flag = false;
		int answer = 0;
		for(char c : br.readLine().toCharArray()) {
			if(c == '*') {
				flag = true;
			}
			else {
				if(c == '(') {
					if(flag) {
						answer--;
					}
					stack.add(c);
				}
				else {
					if(flag) {
						answer++;
					}
					if(stack.isEmpty()) {
						stack.pop();
					}
				}
			}
		}
		System.out.print(answer);
	}
}
