import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		st.nextToken();
		
		Stack<Integer>[] stack = new Stack[7];
		for(int i = 1; i <= 6; i++) {
			stack[i] = new Stack<>();
		}
		
		int answer = 0;	
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			if(!stack[a].isEmpty() && stack[a].peek() > b) {
				while(!stack[a].isEmpty() && stack[a].peek() > b) {
					stack[a].pop();
					answer++;
				}
			}
			
			if(stack[a].isEmpty() || stack[a].peek() < b) {
				answer++;
				stack[a].add(b);
			}
		}
		System.out.print(answer);
	}
}
