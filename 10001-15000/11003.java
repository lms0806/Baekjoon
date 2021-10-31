import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken());

		ArrayDeque<Integer> deque = new ArrayDeque<>();
		int[] arr = new int[n];
		
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			while(!deque.isEmpty() && arr[deque.peekLast()] > arr[i]) {
				deque.pollLast();
			}
			
			deque.offer(i);
			
			if(i - deque.peekFirst() >= l) {
				deque.pollFirst();
			}
			
			sb.append(arr[deque.peekFirst()]).append(" ");
		}
		System.out.print(sb);
	}
}
