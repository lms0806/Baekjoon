import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Deque<Integer> deque = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(new StringBuilder(br.readLine()).reverse().toString());
		for(int i = 1; i <= n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 1) {
				deque.addFirst(i);
			}
			else if(num == 2) {
				int number = deque.pollFirst();
				deque.addFirst(i);
				deque.addFirst(number);
			}
			else {
				deque.addLast(i);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(!deque.isEmpty()) {
			sb.append(deque.poll()).append(" ");
		}
		System.out.print(sb);
	}
}
