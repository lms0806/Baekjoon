import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int sum = 0, max = 0;;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++) {
        	int num = Integer.parseInt(st.nextToken());
        	
        	if(num > 0) {
        		sum += num;
            	max = Math.max(max, num);
            	pq.add(new Node(i, num));
        	}
        }
        
        System.out.print(sum % 2 != 0 || max * 2 > sum ? "no" : solve(pq));
    }
    
    public static String solve(PriorityQueue<Node> pq) {
    	StringBuilder sb = new StringBuilder();
    	sb.append("yes\n");
    	while(!pq.isEmpty()) {
    		Node now = pq.poll(), next = pq.poll();
			
    		now.cost--;
    		next.cost--;
    		
    		if(now.cost != 0) {
    			pq.add(now);
    		}
    		if(next.cost != 0) {
    			pq.add(next);
    		}
    		
			sb.append(now.idx).append(" ").append(next.idx).append("\n");
    	}
    	return sb.toString();
    }
}

class Node implements Comparable<Node> {
	int idx, cost;
	
	public Node(int idx, int cost) {
		this.idx = idx;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node o) {
		return o.cost - this.cost;
	}
}
