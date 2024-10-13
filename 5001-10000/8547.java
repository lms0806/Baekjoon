import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(n --> 0) {
        	pq.add(Integer.parseInt(st.nextToken()));
        }

    	int answer = 0;
    	while(true) {
    		if(pq.size() == 1) {
    			break;
    		}
    		
    		int a = pq.poll(), b = pq.poll();
    		if(a == b) {
    			pq.add(a + b);
    		}
    		else {
    			answer++;
    			pq.add(b);
    		}
    	}
    	System.out.print(pq.size() + answer);
    }
}
