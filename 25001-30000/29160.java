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

		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Integer>[] pq = new PriorityQueue[12];
		for(int i = 1; i < 12; i++) {
			pq[i] = new PriorityQueue<>(Collections.reverseOrder());
		}
		
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			pq[Integer.parseInt(st.nextToken())].add(Integer.parseInt(st.nextToken()));
		}
		
		for(int i = 0; i < k; i++) {
			for(int j = 1; j < 12; j++) {
				if(!pq[j].isEmpty()) {
					pq[j].add(Math.max(pq[j].poll() - 1, 0));
				}
			}
		}
		
		int answer = 0;
		for(int i = 1; i < 12; i++) {
			if(!pq[i].isEmpty()) {
				answer += pq[i].poll();
			}
		}
		
		System.out.print(answer);
	}
}
