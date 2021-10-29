import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			PriorityQueue<Long> pq = new PriorityQueue<>();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(n --> 0) {
				pq.add(Long.parseLong(st.nextToken()));
			}
			
			long answer = 1;
			while(pq.size() != 1) {
				long sum = pq.poll() * pq.poll();
				answer = answer * (sum % 1000000007) % 1000000007;
				pq.add(sum);
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
