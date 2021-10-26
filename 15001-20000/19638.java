import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static PriorityQueue<Integer> pq;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		
		pq = new PriorityQueue<>(Collections.reverseOrder());
		while(n --> 0) {
			pq.add(Integer.parseInt(br.readLine()));
		}
		System.out.print(solve(t, h));
	}
	
	public static String solve(int t, int h) {
		for(int i = 0; i < t; i++) {
			if(pq.peek() < h) {
				return "YES\n" + i;
			}
			
			if(pq.peek() != 1) {
				pq.add(pq.poll() >> 1);
			}
		}
		return pq.peek() < h ? "YES\n" + t : "NO\n" + pq.poll();
	}
}
