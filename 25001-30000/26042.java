import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		int n = Integer.parseInt(br.readLine());
		
		int answer = 0, result = 0;
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 1) {
				deque.addLast(Integer.parseInt(st.nextToken()));
			}
			else {
				deque.removeFirst();
			}
			
			if(answer < deque.size()) {
				answer = deque.size();
				result = deque.peekLast();
			}
			else if(answer == deque.size()) {
				result = Math.min(result, deque.peekLast());
			}
		}
		
		System.out.print(answer + " " + result);
	}
}
