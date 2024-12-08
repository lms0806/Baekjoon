import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static ArrayList<Node>[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine()) + 1;
        
        arr = new ArrayList[n];
        for(int i = 1; i < n; i++) {
        	arr[i] = new ArrayList<>();
        }
        
        String[] list = new String[n];
        for(int i = 1; i < n; i++) {
        	list[i] = br.readLine();
        }
        
        for(int i = 1; i < n; i++) {
        	for(int j = i + 1; j < n; j++) {
        		int cost = 0;
        		for(int k = 0; k < list[i].length(); k++) {
        			cost += Math.pow(list[i].charAt(k) - list[j].charAt(k), 2);
        		}
        		
        		arr[i].add(new Node(j, cost));
        		arr[j].add(new Node(i, cost));
        	}
        }
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.print(dijkstra(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
    }
    
    public static int dijkstra(int sx, int ex) {
    	PriorityQueue<Node> pq = new PriorityQueue<>();
    	int[] dist = new int[n];
    	
    	Arrays.fill(dist, Integer.MAX_VALUE);
    	
    	pq.add(new Node(sx, 0));
    	dist[sx] = 0;
    	
    	while(!pq.isEmpty()) {
    		Node now = pq.poll();
    		
    		if(dist[now.end] < now.cost) {
    			continue;
    		}
    		
    		if(now.end == ex) {
    			return dist[now.end];
    		}
    		
    		for(Node next : arr[now.end]) {
    			if(dist[next.end] > dist[now.end] + next.cost) {
    				dist[next.end] = dist[now.end] + next.cost;
    				pq.add(new Node(next.end, dist[next.end]));
    			}
    		}
    	}
    	
    	return -1;
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
