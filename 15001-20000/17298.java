import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[] num = new int[size];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < size; i++) {
			while(!stack.isEmpty() && num[stack.peek()] < num[i]) {
				num[stack.pop()] = num[i];
			}
			stack.add(i);
		}
		
		while(!stack.isEmpty()) {
			num[stack.pop()] = -1;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int n : num) {
			sb.append(n).append(" ");
		}
		System.out.print(sb);
	}
}
