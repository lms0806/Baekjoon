import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		st.nextToken();
		int size = Integer.parseInt(st.nextToken());
		
		Stack<Integer> stack = new Stack<>();
		
		String s = br.readLine();
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			int n = s.charAt(i) - '0';
			
			while(count < size && !stack.isEmpty() && stack.peek() < n) {
				stack.pop();
				count++;
			}
			stack.add(n);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length() - size; i++) {
			sb.append(stack.get(i));
		}
		System.out.print(sb);
	}
}
