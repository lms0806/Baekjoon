import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		double[] arr = new double[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Double.parseDouble(br.readLine());
		}
		
		Stack<Double> stack = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if(c >= 'A' && c <= 'Z') {
				stack.add(arr[c - 'A']);
			}
			else {
				double b = stack.pop(), a = stack.pop();
				
				stack.add(c == '+' ? a + b : c == '-' ? a - b : c == '*' ? a * b : a / b);
			}
		}
		System.out.print(String.format("%.2f", stack.pop()));
	}
}
