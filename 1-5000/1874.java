import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		StringBuilder sb = new StringBuilder();
		int num = 0;
		while(t --> 0){
			int n = Integer.parseInt(br.readLine());
			
			if(num < n) {
				while(num < n) {
					stack.add(num + 1);
					sb.append("+").append("\n");
					num++;
				}
				num = n;
			}
			else if(stack.peek() != n) {
				System.out.print("NO");
				return;
			}
			
			stack.pop();
			sb.append("-").append("\n");
		}
		System.out.print(sb);
	}
}
