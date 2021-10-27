import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Long> pq = new PriorityQueue<>();
		st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			pq.add(Long.parseLong(st.nextToken()));
		}
		
		while(m --> 0) {
			long num = pq.poll() + pq.poll();
			pq.add(num);
			pq.add(num);
		}
		
		long answer = 0;
		while(!pq.isEmpty()) {
			answer += pq.poll();
		}
		System.out.print(answer);
	}
}
