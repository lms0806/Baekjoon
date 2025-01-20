import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n + 2];
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		stack.add(0);
		for(int i = 1; i <= n + 1; i++) {
			while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
				answer = Math.max(answer, arr[stack.pop()] * (i - stack.peek() - 1));
			}
			stack.add(i);
		}
		System.out.print(answer);
	}
}
