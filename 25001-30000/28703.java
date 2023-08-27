import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		int max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			max = Math.max(max, num);
			
			pq.add(num);
		}
		
		int startmax = max;
		int answer = startmax - pq.peek();
		while(pq.peek() <= max) {
			int num = pq.poll();
			
			answer = Math.min(answer, startmax - num);
			
			pq.add(num * 2);
			
			startmax = Math.max(startmax, num * 2);
		}
		System.out.print(Math.min(answer, startmax - pq.peek()));
	}
}
