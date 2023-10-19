import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer>[] stack = new Stack[4];
		for(int i = 0; i < 4; i++) {
			stack[i] = new Stack<>();
			stack[i].add(0);
		}
		
		int n = Integer.parseInt(br.readLine());
		
		boolean check = true;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			int num = Integer.parseInt(st.nextToken());
			
			boolean flag = false;
			for(int i = 0; i < 4; i++) {
				if(num > stack[i].peek()) {
					stack[i].add(num);
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				check = false;
				break;
			}
		}
		
		System.out.print(check ? "YES" : "NO");
	}
}
