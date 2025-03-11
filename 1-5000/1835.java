import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Deque<Integer> deque = new ArrayDeque<>(n);
		deque.add(n);
		for(int i = n - 1; i > 0; i--) {
			deque.addFirst(i);
			
			for(int j = 0; j < i; j++) {
				deque.addFirst(deque.pollLast());
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(!deque.isEmpty()) {
			sb.append(deque.pollFirst()).append(" ");
		}
		System.out.print(sb);
	}
}
