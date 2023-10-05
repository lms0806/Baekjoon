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
		
		for(int i = 0; i < m; i++) {
			pq.add(Long.parseLong(br.readLine()));
		}
		
		long answer = 0, sum = 0;
		for(int i = 0; i < n - m; i++) {
			sum += pq.poll();
			answer += sum;
			
			pq.add(Long.parseLong(br.readLine()));
		}
		
		while(!pq.isEmpty()) {
			sum += pq.poll();
			answer += sum;
		}
		System.out.print(answer);
	}
}
