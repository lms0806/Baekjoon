import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			pq.add(Integer.parseInt(st.nextToken()));
		}
		
		int answer = 0;
		while(pq.size() > 1) {
			int a = pq.poll() - 1, b = pq.poll() - 1;
			
			if(a != 0) {
				pq.add(a);
			}
			if(b != 0) {
				pq.add(b);
			}
			answer++;
		}
		
		if(!pq.isEmpty()) {
			answer += pq.poll();
		}
		
		System.out.println(answer > 1440 ? -1 : answer);
	}
}
