import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main{
	static int n;
	static int[] oil;
	static long[][] dist;
	static ArrayList<Node>[] arr;
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	
    	oil = new int[n + 1];
    	arr = new ArrayList[n + 1];
    	dist = new long[n + 1][2501];
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i = 1; i <= n; i++) {
    		arr[i] = new ArrayList<>();
    		Arrays.fill(dist[i], Long.MAX_VALUE);
    		oil[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	while(m --> 0) {
    		st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
    		long cost = Long.parseLong(st.nextToken());
    		
    		arr[a].add(new Node(b, cost));
    		arr[b].add(new Node(a, cost));
    	}
    	
    	dijkstra();
    	
    	long answer = Long.MAX_VALUE;
    	for(int i = 1; i < 2501; i++) {
    		answer = Math.min(answer, dist[n][i]);
    	}
    	System.out.print(answer);
    }
    
    public static void dijkstra() {
    	PriorityQueue<Node> pq = new PriorityQueue<>();
    	
    	dist[1][oil[1]] = 0;
    	pq.add(new Node(1, 0, oil[1]));
    	
    	while(!pq.isEmpty()) {
    		Node now = pq.poll();
    		
    		if(now.cost > dist[now.end][now.oil]) {
    			continue;
    		}
    		
    		for(Node node : arr[now.end]) {
    			int next = node.end;
    			long next_cost = now.cost + now.oil * node.cost;
    			int next_oil = Math.min(now.oil, oil[next]);
    			
    			if(next_cost < dist[next][next_oil]) {
    				dist[next][next_oil] = next_cost;
    				pq.add(new Node(next, next_cost, next_oil));
    			}
    		}
    	}
    }
}

class Node implements Comparable<Node>{
	int end, oil;
	long cost;
	
	public Node(int end, long cost) {
		this.end = end;
		this.cost = cost;
	}
	
	public Node(int end, long cost, int oil) {
		this.end = end;
		this.cost = cost;
		this.oil = oil;
	}
	
	@Override
	public int compareTo(Node o) {
		return (int) (this.cost - o.cost);
	}
}
