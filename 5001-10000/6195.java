import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
			
		PriorityQueue<Long> pq = new PriorityQueue<>();
			
		while(n --> 0) {
			pq.add(Long.parseLong(br.readLine()));
		}
			
		long answer = 0;
		while(pq.size() != 1) {
			long sum = pq.poll() + pq.poll();
			answer += sum;
			pq.add(sum);
		}
		System.out.print(answer);
	}
}
