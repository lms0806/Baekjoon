import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n, INF = 200000000;
	static ArrayList<Node>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
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
		
		st = new StringTokenizer(br.readLine());
		int v1 = Integer.parseInt(st.nextToken()), v2 = Integer.parseInt(st.nextToken());
		
		int a = dijkstra(1, v1);
		a += dijkstra(v1, v2);
		a += dijkstra(v2, n);
		
		int b = dijkstra(1, v2);
		b += dijkstra(v2, v1);
		b += dijkstra(v1, n);
		
		System.out.print(a >= INF && b >= INF ? -1 : Math.min(a, b));
    }
	
	public static int dijkstra(int start, int end) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		boolean[] visited = new boolean[n + 1];
		int[] dist = new int[n + 1];
		pq.add(new Node(start, 0));
		
		Arrays.fill(dist, INF);
		visited[start] = true;
		dist[start] = 0;
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			int cur = now.start;
			
			for(Node a : arr[cur]) {
				if(!visited[a.start] && dist[a.start] > dist[cur] + a.cost) {
					dist[a.start] = dist[cur] + a.cost;
					pq.add(new Node(a.start, dist[a.start]));
				}
			}
		}
		
		return dist[end];
	}
}

class Node implements Comparable<Node>{
	int start, cost;
	
	public Node(int start, int cost) {
		this.start = start;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node o) {
		return this.cost - o.cost;
	}
}
