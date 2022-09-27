import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n, INF = 100000000;
	static ArrayList<Node>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
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
		
		int[] from = dijkstra(1, n);
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			sb.append(from[a] + from[b]).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int[] dijkstra(int start, int end) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int[] dist = new int[n + 1];
		
		Arrays.fill(dist, INF);
		
		pq.add(new Node(start, 0));
		dist[start] = 0;
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			int cur = now.start;
			
			if(dist[cur] < now.cost) {
				continue;
			}
			
			for(Node a : arr[cur]) {
				if(dist[a.start] > dist[cur] + a.cost) {
					dist[a.start] = dist[cur] + a.cost;
					pq.add(new Node(a.start, dist[a.start]));
				}
			}
		}
		return dist;
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
