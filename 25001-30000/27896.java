import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		long sum = 0, answer = 0;
		st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			long num = Long.parseLong(st.nextToken());

			pq.add(num);
			sum += num;
			
			while(sum >= m) {
				sum -= pq.poll() * 2;
				answer++;
			}
		}
		System.out.print(answer);
	}
}
