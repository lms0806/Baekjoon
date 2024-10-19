import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	while(n --> 0) {
    		pq.add(Long.parseLong(st.nextToken()));
    	}
    	
    	long answer = 0;
    	while(pq.size() > 1) {
    		long a = pq.poll(), b = pq.poll();
    		
    		answer += a + b;
    		pq.add(Math.max(a, b));
    	}
    	System.out.print(answer);
    }
}
