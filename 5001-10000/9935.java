import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine(), s = br.readLine();
		
		Stack<Character> stack = new Stack<>();
		for(char ch : str.toCharArray()) {
			stack.add(ch);
			if(stack.size() >= s.length()) {
				boolean flag = true;
				for(int j = 0; j < s.length(); j++) {
					if(stack.get(stack.size() - s.length() + j) != s.charAt(j)) {
						flag = false;
						break;
					}
				}
				
				if(flag) {
					for(int j = 0; j < s.length(); j++) {
						stack.pop();
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(char ch : stack) {
			sb.append(ch);
		}
		System.out.print(sb.length() == 0 ? "FRULA" : sb);
	}
}
