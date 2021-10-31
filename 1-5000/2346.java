import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	static int x, y;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayDeque<int[]> deque = new ArrayDeque<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int move = Integer.parseInt(st.nextToken());
		
		for(int i = 2; i <= n; i++) {
			deque.add(new int[] {i, Integer.parseInt(st.nextToken())});
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("1 ");
		while(!deque.isEmpty()) {
			int[] next;
			if(move > 0) {
				for(int i = 1; i < move; i++) {
					deque.add(deque.pollFirst());
				}
				next = deque.removeFirst();
			}
			else {
				for(int i = move; i < -1; i++) {
					deque.addFirst(deque.pollLast());
				}
				next = deque.removeLast();
			}
			move = next[1];
			sb.append(next[0]).append(" ");
		}
		System.out.print(sb);
	}
}
