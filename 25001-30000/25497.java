import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		
		Stack<Character> stack = new Stack<>(), stack1 = new Stack<>();
		
		int answer = 0;
		for(char c : br.readLine().toCharArray()) {
			if(c == 'L') {
				stack.add(c);
			}
            else if(c == 'S') {
				stack1.add(c);
			}
			else if(c == 'R') {
				if(!stack.isEmpty()) {
					answer++;
					stack.pop();
				}
				else {
					break;
				}
			}
			else if(c == 'K') {
				if(!stack1.isEmpty()) {
					answer++;
					stack1.pop();
				}
				else {
					break;
				}
			}
			else {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
