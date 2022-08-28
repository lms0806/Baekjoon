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
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			pq.add(Integer.parseInt(st.nextToken()));
		}
		
		int answer= 1;
		st = new StringTokenizer(br.readLine());
		while(m --> 0) {
			int num = Integer.parseInt(st.nextToken());
			
			if(pq.peek() >= num) {
				pq.add(pq.poll() - num);
			}
			else {
				answer= 0;
				break;
			}
		}
		
		System.out.print(answer);
	}
}
