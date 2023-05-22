import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		long answer = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num % 2 == 1) {
				pq.add(num);
			}
			else {
				answer += num;
			}
		}
		
		while(pq.size() > 1) {
			answer += pq.poll() + pq.poll();
		}
		
		System.out.print(answer);
	}
}
