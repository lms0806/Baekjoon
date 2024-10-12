import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int test = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int t = 1; t <= test; t++) {
        	int n = Integer.parseInt(br.readLine());
        	
        	int sum = 0;
        	
        	PriorityQueue<Node> pq = new PriorityQueue<>();
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int i = 0; i < n; i++) {
        		int num = Integer.parseInt(st.nextToken());
        		sum += num;
        		pq.add(new Node(i, num));
        	}
        	
        	sb.append("Case #").append(t).append(": ");
        	int size = sum % 2 == 1 ? 1 : 2;
        	while(!pq.isEmpty()) {
        		for(int i = 0; i < size; i++) {
        			Node now = pq.poll();
        			sb.append((char)(now.idx + 'A'));
        			now.cost--;
        			
        			if(now.cost != 0) {
        				pq.add(now);
        			}
        		}
        		
        		sb.append(" ");
        		size = 2;
        	}
        	sb.append("\n");
        }
        System.out.print(sb);
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
