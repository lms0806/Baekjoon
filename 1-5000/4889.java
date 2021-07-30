import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		StringBuilder sb = new StringBuilder();
		int count = 1;
		while(true) {
			String s = br.readLine();
			
			if(s.contains("-")) {
				break;
			}
			
			Stack<Character> stack = new Stack<>();
			
			int answer = 0;
			for(char ch : s.toCharArray()) {
				if(ch == '{') {
					stack.add(ch);
				}
				else {
					if(stack.isEmpty()) {
						answer++;
						stack.add('{');
					}
					else {
						stack.pop();
					}
				}
			}
			sb.append(count).append(". ").append(answer + (stack.size() / 2)).append("\n");
			count++;
		}
		System.out.print(sb);
	}
}
