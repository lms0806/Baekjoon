import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int t = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
        
        PriorityQueue<Node> pq = new PriorityQueue<>();
        while(n --> 0) {
        	st = new StringTokenizer(br.readLine());
        	
        	pq.add(new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        
        StringBuilder sb = new StringBuilder();
        while(t --> 0) {        	
        	Node now = pq.poll();
        	
        	sb.append(now.id).append("\n");
        	
        	if(now.cost > 1) {
        		pq.add(new Node(now.id, now.cost - 1, now.rank - 1));
        	}
        }
        System.out.print(sb);
    }
}

class Node implements Comparable<Node> {
	int id, cost, rank;
	
	public Node(int id, int cost, int rank) {
		this.id = id;
		this.cost = cost;
		this.rank = rank;
	}

	@Override
	public int compareTo(Node o) {
		if(o.rank == this.rank) {
			return this.id - o.id;
		}
        return o.rank - this.rank;
	}
}
