import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			if(n == 1) {
				deque.addFirst(Integer.parseInt(st.nextToken()));
				continue;
			}
			else if(n == 2) {
				deque.addLast(Integer.parseInt(st.nextToken()));
				continue;
			}
			else if(n == 3){
				sb.append(deque.isEmpty() ? -1 : deque.pollFirst());
			}
			else if(n == 4) {
				sb.append(deque.isEmpty() ? -1 : deque.pollLast());
			}
			else if(n == 5) {
				sb.append(deque.size());
			}
			else if(n == 6) {
				sb.append(deque.isEmpty() ? 1 : 0);
			}
			else if(n == 7) {
				sb.append(deque.isEmpty() ? -1 : deque.peekFirst());
			}
			else {
				sb.append(deque.isEmpty() ? -1 : deque.peekLast());
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
