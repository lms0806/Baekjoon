import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static long INF = 300000000000l;
	static ArrayList<Node>[] arr;
	static long[][] dist;
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
		int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());
		
		int t = Integer.parseInt(br.readLine());
		dist = new long[t + 1][n + 1];
		
		dijkstra(0, start);
		
		int[] p = new int[t + 1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= t; i++) {
			p[i] = Integer.parseInt(st.nextToken());
			dijkstra(i, p[i]);
		}
		
		
		long answer = INF;
		for(int i = 1; i <= t; i++) {
			for(int j = 1; j <= t; j++) {
				if(i == j) {
					continue;
				}
				for(int k = 1; k <= t; k++) {
					if(i == k || j == k) {
						continue;
					}
					if(dist[0][p[i]] == INF || dist[i][p[j]] == INF || dist[j][p[k]] == INF || dist[k][end] == INF) {
						continue;
					}
					
					answer = Math.min(answer, dist[0][p[i]] + dist[i][p[j]] + dist[j][p[k]] + dist[k][end]);
				}
			}
		}
		System.out.print(answer == INF ? -1 : answer);
	}
	
	public static long[] dijkstra(int idx, int start) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		
		Arrays.fill(dist[idx], INF);
		
		pq.add(new Node(start, 0));
		dist[idx][start] = 0;
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			int cur = now.start;
			
			if(dist[idx][cur] < now.cost) {
				continue;
			}
			
			for(Node a : arr[cur]) {
				if(dist[idx][a.start] > dist[idx][cur] + a.cost) {
					dist[idx][a.start] = dist[idx][cur] + a.cost;
					pq.add(new Node(a.start, dist[idx][a.start]));
				}
			}
		}
		return dist[idx];
	}
}

class Node implements Comparable<Node>{
	int start;
	long cost;
	
	public Node(int start, long cost) {
		this.start = start;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node o) {
		return (int)(this.cost - o.cost);
	}
}
