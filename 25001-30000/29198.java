import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		st.nextToken();
		int k = Integer.parseInt(st.nextToken());
		
		PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		while(n --> 0) {
			char[] c = br.readLine().toCharArray();
			
			Arrays.sort(c);
			
			String s = new String(c);
			
			if(pq.size() < k) {
				pq.add(s);
			}
			else if(pq.size() == k && pq.peek().compareTo(s) > 0) {
				pq.poll();
				pq.add(s);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(!pq.isEmpty()) {
			sb.append(pq.poll());
		}
		
		char[] ch = sb.toString().toCharArray();
		
		Arrays.sort(ch);
		
		System.out.print(ch);
	}
}
