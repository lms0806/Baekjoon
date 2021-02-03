import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		Stack<Integer> stack = new Stack<>();
		
		int size = Integer.parseInt(br.readLine())+1;
		int charat;
		String str;
		
		StringBuilder sb = new StringBuilder();
		while(0<--size) {
			str = br.readLine();
			charat = str.charAt(0);
			if(charat == 't') {
				sb.append(stack.size() != 0 ? stack.get(stack.size()-1) : -1).append("\n");
			}
			else if(charat == 'e') {
				sb.append(stack.empty() ? 1 : 0).append("\n");
			}
			else if(charat == 's') {
				sb.append(stack.size()).append("\n");
			}
			else if(charat == 'p') {
				if(str.charAt(1) == 'u') {
					stack.push(Integer.parseInt(str.substring(5)));
				}
				else {
					sb.append(stack.size() != 0 ? stack.pop() : -1).append("\n");
				}
			}
		}
		System.out.print(sb);
	}
}
