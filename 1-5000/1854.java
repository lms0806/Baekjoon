import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n, k;
	static ArrayList<Node>[] arr;
	static PriorityQueue<Integer>[] kpq;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        
        kpq = new PriorityQueue[n + 1];
        arr = new ArrayList[n + 1];
        for(int i = 1; i <= n; i++) {
        	kpq[i] = new PriorityQueue<>(Collections.reverseOrder());
        	arr[i] = new ArrayList<>();
        }
        
        while(m --> 0) {
        	st = new StringTokenizer(br.readLine());
        	
        	arr[Integer.parseInt(st.nextToken())].add(new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        
        dijkstra();
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++) {
        	sb.append(kpq[i].size() != k ? "-1" : kpq[i].peek()).append("\n");
        }
        System.out.print(sb);
    }
    
    public static void dijkstra() {
    	PriorityQueue<Node> pq = new PriorityQueue<>();
    	pq.add(new Node(1, 0));
    	kpq[1].add(0);
    	
    	while(!pq.isEmpty()) {
    		Node now = pq.poll();
    		
    		for(Node next : arr[now.end]) {
    			int cost = next.cost + now.cost;
    			
    			if(kpq[next.end].size() < k) {
    				kpq[next.end].add(cost);
    				pq.add(new Node(next.end, cost));
    			}
    			else if(kpq[next.end].peek() > cost) {
    				kpq[next.end].poll();
    				kpq[next.end].add(cost);
    				pq.add(new Node(next.end, cost));
    			}
    		}
    	}
    }
}

class Node implements Comparable<Node> {
	int end, cost;
	
	public Node(int end, int cost) {
		this.end = end;
		this.cost = cost;
	}
	
	@Override
	public int compareTo(Node o) {
		return this.cost - o.cost;
	}
}
