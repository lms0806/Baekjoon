import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main {
	static int n;
	static int[] dist;
	static int[][] dist2;
	static ArrayList<Node>[] arr;
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	
    	dist = new int[n + 1];
    	dist2 = new int[2][n + 1];
    	arr = new ArrayList[n + 1];
    	
    	Arrays.fill(dist, Integer.MAX_VALUE);
    	Arrays.fill(dist2[0], Integer.MAX_VALUE);
    	Arrays.fill(dist2[1], Integer.MAX_VALUE);
    	
    	for(int i = 1; i <= n; i++) {
    		arr[i] = new ArrayList<>();
    	}
    	
    	while(m --> 0) {
    		st = new StringTokenizer(br.readLine());
    		int s = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
    		int cost = Integer.parseInt(st.nextToken()) << 1;
    		
    		arr[s].add(new Node(e, cost));
    		arr[e].add(new Node(s, cost));
    	}
    	
    	dijkstra();
    	dijkstra2();
    	
    	int answer = 0;
    	for(int i = 1; i <= n; i++) {
    		if(dist[i] < Math.min(dist2[0][i], dist2[1][i])) {
    			answer++;
    		}
    	}
    	System.out.print(answer);
    }
    
    public static void dijkstra() {
    	PriorityQueue<Node> pq = new PriorityQueue<>();
    	pq.add(new Node(1, 0));
    	dist[1] = 0;
    	
    	while(!pq.isEmpty()) {
    		Node now = pq.poll();
    		
    		if(dist[now.end] < now.cost) {
    			continue;
    		}
    		
    		for(Node next : arr[now.end]) {
    			if(dist[next.end] > dist[now.end] + next.cost) {
    				dist[next.end] = dist[now.end] + next.cost;
    				pq.add(new Node(next.end, dist[next.end]));
    			}
    		}
    	}
    }
    
    public static void dijkstra2() {
    	PriorityQueue<Node> pq = new PriorityQueue<>();
    	pq.add(new Node(1, 0, 0));
    	dist2[0][1] = 0;
    	
    	while(!pq.isEmpty()) {
    		Node now = pq.poll();
    		
    		if(dist2[now.dir][now.end] < now.cost) {
    			continue;
    		}
    		
    		for(Node next : arr[now.end]) {
    			int nextDir = now.dir == 0 ? 1 : 0;
    			int nextCost = dist2[now.dir][now.end] + (now.dir == 0 ? next.cost >> 1 : next.cost << 1);
    			
    			if(dist2[nextDir][next.end] > nextCost) {
    				dist2[nextDir][next.end] = nextCost;
    				pq.add(new Node(next.end, nextCost, nextDir));
    			}
    		}
    	}
    }
}

class Node implements Comparable<Node>{
	int dir, end, cost;
	
	public Node(int end, int cost) {
		this.end = end;
		this.cost = cost;
	}
	
	public Node(int end, int cost, int dir) {
		this.end = end;
		this.cost = cost;
		this.dir = dir;
	}
	
	@Override
	public int compareTo(Node o) {
		return this.cost - o.cost;
	}
}
