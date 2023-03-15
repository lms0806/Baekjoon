import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()) - 1;
		int m = Integer.parseInt(st.nextToken());
		
		Deque<Integer> dq = new ArrayDeque<>();
		
		for(int i = 1; i <= n; i++) {
			dq.addLast(i);
		}
		
		int count = 0;
		boolean flag = false;
		StringBuilder sb = new StringBuilder();
		while(!dq.isEmpty()) {
			if(count == m) {
				count = 0;
				flag = !flag;
			}
			
			if(!flag) {
				for(int i = 0; i < k; i++) {
					dq.addLast(dq.pollFirst());
				}
				sb.append(dq.pollFirst());
			}
			else {
				for(int i = 0; i < k; i++) {
					dq.addFirst(dq.pollLast());
				}
				sb.append(dq.pollLast());
			}
			count++;
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
