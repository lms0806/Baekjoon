import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static ArrayList<Node>[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());
		int money = Integer.parseInt(st.nextToken());
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int percent = Integer.parseInt(st.nextToken());
			
			arr[a].add(new Node(b, percent));
			arr[b].add(new Node(a, percent));
		}
		
		System.out.print(dijkstra(start, end, money));
	}
	
	public static int dijkstra(int start, int end, int money) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int[] dist = new int[n + 1];
		
		pq.add(new Node(start, money));
		dist[start] = money;
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(dist[now.to] > now.cost) {
				continue;
			}
			
			for(Node next : arr[now.to]) {
				int cost = (int) (dist[now.to] * ((double)(100 - next.cost) / 100.0));
				
				if(dist[next.to] < cost) {
					dist[next.to] = cost;
					pq.add(new Node(next.to, cost));
				}
			}
		}
		
		return dist[end];
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
		return o.cost - this.cost;
	}
}
