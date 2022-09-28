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
		
		arr = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			arr[a].add(new Node(b, cost, 0));
		}
		
		int[] path = dijkstra();
		
		int i = 0;
		while(path[i] == INF) {
			i++;
		}
		
		System.out.print(path[i]);
	}
	
	public static int[] dijkstra() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int[][] dist = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			Arrays.fill(dist[i], INF);
		}
		
		pq.add(new Node(0, 0, 0));
		dist[0][0] = 0;
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			int cur = now.start;
			
			if(dist[now.start][now.count] < now.cost) {
				continue;
			}
			
			if(now.count == n - 1) {
				continue;
			}
			
			for(Node a : arr[cur]) {
				if(dist[a.start][now.count + 1] > dist[cur][now.count] + a.cost) {
					dist[a.start][now.count + 1] = dist[cur][now.count] + a.cost;
					pq.add(new Node(a.start, dist[a.start][now.count + 1], now.count + 1));
				}
			}
		}
		return dist[1];
	}
}

class Node implements Comparable<Node>{
	int start, cost, count;
	
	public Node(int start, int cost, int count) {
		this.start = start;
		this.cost = cost;
		this.count = count;
	}

	@Override
	public int compareTo(Node o) {
		if(this.count == o.count) {
			return this.cost - o.cost;
		}
		return this.count - o.count;
	}
}
