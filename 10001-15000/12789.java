import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[] number = new int[size];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}
		
		Stack<Integer> stack = new Stack<>();
		
		int n = 1;
		for(int i = 0; i < number.length; i++) {
			if(n != number[i]) {
				if(!stack.isEmpty() && stack.peek() == n) {
					stack.pop();
					n++;
					i--;
				}
				else {
					stack.add(number[i]);
				}
			}
			else {
				n++;
			}
		}
		
		boolean b = true;
		for(int i = 0; i < stack.size(); i++){
			if(n == stack.pop()) {
				n++;
			}
			else {
				b = false;
				break;
			}
		}
		
		System.out.print(b ? "Nice" : "Sad");
	}
}
