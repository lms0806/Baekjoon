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
        
        boolean[] prime = new boolean[12001];
        prime[0] = prime[1] = true;
        for(int i = 2; i * i <= 12000; i++) {
        	if(!prime[i]) {
        		for(int j = i + i; j <= 12000; j += i) {
        			prime[j] = true;
        		}
        	}
        }
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int x1 = Integer.parseInt(st.nextToken()), y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken()), y2 = Integer.parseInt(st.nextToken());
        
        n = Integer.parseInt(br.readLine()) + 2;
        
        arr = new ArrayList[n];
        for(int i = 0; i < n; i++) {
        	arr[i] = new ArrayList<>();
        }
        
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[] {x1, y1});
        for(int i = 1; i < n - 1; i++) {
        	st = new StringTokenizer(br.readLine());
        	
        	list.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }
        list.add(new int[] {x2, y2});
        
        for(int i = 0; i < list.size(); i++) {
        	for(int j = i + 1; j < list.size(); j++) {
        		int cost = (int)(Math.sqrt(Math.pow(list.get(i)[0] - list.get(j)[0], 2) + Math.pow(list.get(i)[1] - list.get(j)[1], 2)));
        		
        		if(prime[cost]) {
        			continue;
        		}
        		
        		arr[i].add(new Node(j, cost));
        		arr[j].add(new Node(i, cost));
        	}
        }
        
        System.out.print(dijkstra(x1, y1, x2, y2));;
    }  
    
    public static int dijkstra(int sx, int sy, int ex, int ey) {
    	PriorityQueue<Node> pq = new PriorityQueue<>();
    	int[] dist = new int[n];
    	
    	Arrays.fill(dist, Integer.MAX_VALUE);
    	
    	pq.add(new Node(0, 0));
    	dist[0] = 0;
    	
    	while(!pq.isEmpty()) {
    		Node now = pq.poll();
    		
    		if(dist[now.end] < now.cost) {
    			continue;
    		}
    		
    		if(now.end == n - 1) {
    			return dist[n - 1];
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
