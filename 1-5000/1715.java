import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		int n = Integer.parseInt(br.readLine());
		
		while(n --> 0) {
			pq.add(Integer.parseInt(br.readLine()));
		}
		
		long answer = 0;
		while(pq.size() != 1) {
			int num = pq.poll() + pq.poll();
			
			answer += num;
			pq.add(num);
		}
		System.out.print(answer);
	}
}
