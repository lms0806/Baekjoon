import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[] before;
	static ArrayList<Node>[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        before = new int[n + 1];
        arr = new ArrayList[n + 1];
        for(int i = 1; i <= n; i++) {
        	arr[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < m; i++) {
        	st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        	int cost = Integer.parseInt(st.nextToken());
        	
        	arr[a].add(new Node(b, cost));
        	arr[b].add(new Node(a, cost));
        }
        
        int answer = dijkstra(0);
        for(int i = n; i > 1;) {
        	answer = Math.max(answer, dijkstra(i));
        	i = before[i];
        }
        System.out.print(answer);
    }
    
    public static int dijkstra(int x) {
    	PriorityQueue<Node> pq = new PriorityQueue<>();
    	int[] dist = new int[n + 1];
    	
    	Arrays.fill(dist, Integer.MAX_VALUE);
    	
    	pq.add(new Node(1, 0));
    	dist[1] = 0;
    	
    	while(!pq.isEmpty()) {
    		Node now = pq.poll();
    		
    		for(Node next : arr[now.end]) {
    			if((now.end == x && next.end == before[x]) || (now.end == before[x] && next.end == x)) {
    				continue;
    			}
    			
    			if(dist[next.end] > dist[now.end] + next.cost) {
    				dist[next.end] = dist[now.end] + next.cost;
    				if(x == 0) {
    					before[next.end] = now.end;
    				}
    				pq.add(new Node(next.end, dist[next.end]));
    			}
    			
    		}
    	}
    	return dist[n] == Integer.MAX_VALUE ? -1 : dist[n];
    }
}

class Node implements Comparable<Node>{
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
