import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		int[] building = new int[n];
		
		for(int i = 0; i < n; i++) {
			building[i] = Integer.parseInt(br.readLine());
		}
		
		long answer = 0;
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < n; i++) {
			while(!stack.isEmpty() && stack.peek() <= building[i]) {
				stack.pop();
			}
			
			answer += stack.size();
			
			stack.add(building[i]);
		}
		System.out.print(answer);
	}
}
