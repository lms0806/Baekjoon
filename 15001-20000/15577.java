import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Double> pq = new PriorityQueue<>();
		while(n --> 0) {
			pq.offer(Double.parseDouble(br.readLine()));
		}
		
		while(pq.size() != 1) {
			pq.add((pq.poll() + pq.poll()) / 2);
		}
		
		System.out.print(pq.poll());
	}	
}
