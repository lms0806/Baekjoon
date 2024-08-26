import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static long sum = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		long h = Long.parseLong(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Long> pq = new PriorityQueue<>();
		
		st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			long num = Long.parseLong(st.nextToken());
			
			sum += num;
			pq.add(num);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(sum < h ? -1 : solve(pq, h)).append("\n");
		while(q --> 0) {
			long num = Long.parseLong(br.readLine());
			
			sum += num;
			pq.add(num);
			
			sb.append(sum < h ? -1 : solve(pq, h)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int solve(PriorityQueue<Long> pq, long h) {
		while(true) {
			if(sum - pq.peek() < h) {
				break;
			}
			sum -= pq.poll();
		}
		return pq.size();
	}
}
