import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static boolean flag;
	static int[] parent;
	static int citya, cityb;
	static ArrayList<Node>[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		parent = new int[n + 1];
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			arr[a].add(new Node(b, cost));
			arr[b].add(new Node(a, cost));
		}
		
		parent[1] = 1;
		int time = dijkstra();
		flag = true;
		
		int delay_time = 0;
		for(int i = n; i != parent[i]; i = parent[i]) {
			citya = i;
			cityb = parent[i];
			delay_time = Math.max(delay_time, dijkstra());
			
			if(delay_time == Integer.MAX_VALUE) {
				break;
			}
		}
		
		System.out.print(delay_time == Integer.MAX_VALUE ? -1 : delay_time - time);
	}
	
	public static int dijkstra() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int[] dist = new int[n + 1];
		
		Arrays.fill(dist, Integer.MAX_VALUE);
		
		pq.add(new Node(1, 0));
		dist[1] = 0;
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(dist[now.to] < now.cost) {
				continue;
			}
			
			for(Node next : arr[now.to]) {
				if((citya == now.to && cityb == next.to) || (cityb == now.to && citya == next.to)) {
					continue;
				}
				
				if(dist[next.to] > dist[now.to] + next.cost) {
					if(!flag) {
						parent[next.to] = now.to;
					}
					dist[next.to] = dist[now.to] + next.cost;
					pq.add(new Node(next.to, dist[next.to]));
				}
			}
		}
		
		return dist[n];
	}
}

class Node implements Comparable<Node>{
	int to, cost;
	
	public Node(int to, int cost) {
		this.to = to;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node o) {
		return this.cost - o.cost;
	}
}
