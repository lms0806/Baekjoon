import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int num = 1;
		Deque<Integer> dq = new ArrayDeque<>();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char c = st.nextToken().charAt(0);
			char lr = st.nextToken().charAt(0);
			
			if(c == 'A') {
				if(lr == 'L') {
					dq.addFirst(num);
				}
				else {
					dq.addLast(num);
				}
				num++;
			}
			else {
				int n = Integer.parseInt(st.nextToken());
				
				if(lr == 'L') {
					while(n --> 0) {
						dq.pollFirst();
					}
				}
				else {
					while(n --> 0) {
						dq.pollLast();
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(!dq.isEmpty()) {
			sb.append(dq.pollFirst()).append("\n");
		}
		System.out.print(sb);
	}
}
