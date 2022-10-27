import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Long> productpq = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Long> clientpq = new PriorityQueue<>();
		
		st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			productpq.add(Long.parseLong(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		while(m --> 0) {
			clientpq.add(Long.parseLong(st.nextToken()));
		}
		
		long answer = 0;
		while(!productpq.isEmpty() && !clientpq.isEmpty()) {
			long product = productpq.poll();
			long client = clientpq.poll();
			
			if(product < client) {
				break;
			}
			
			answer += product - client;
		}
		System.out.print(answer);
	}
}
