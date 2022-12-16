import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n, INF = 1000000000;
	static int[][] dist;
	static ArrayList<Node>[] arr;
	static PriorityQueue<Node> pq = new PriorityQueue<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int jin = Integer.parseInt(br.readLine());
		
		int k = Integer.parseInt(br.readLine());
		
		int[] house = new int[n + 1];
		
		for(int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < k; j++) {
				house[Integer.parseInt(st.nextToken())] = i + 1;
			}
		}
		
		dist = new int[3][n + 1];
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 1; i < 3; i++) {
			Arrays.fill(dist[i], INF);
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			arr[a].add(new Node(b, cost));
			arr[b].add(new Node(a, cost));
		}
		
		for(int i = 1; i <= n; i++) {
			if(house[i] == 1) {
				dist[1][i] = 0;
				pq.add(new Node(i, 0));
			}
		}
		Dijkstra(1);
		for(int i = 1; i <= n; i++) {
			if(house[i] == 2) {
				dist[2][i] = 0;
				pq.add(new Node(i, 0));
			}
		}
		Dijkstra(2);
		
		StringBuilder sb = new StringBuilder();
		if(dist[1][jin] != INF || dist[2][jin] != INF) {
			sb.append(dist[1][jin] <= dist[2][jin] ? "A" : "B").append("\n").append(Math.min(dist[1][jin], dist[2][jin]));
		}
		else {
			sb.append(-1);
		}
		System.out.print(sb);
	}
	
	public static void Dijkstra(int num) {
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(dist[num][now.to] < now.cost) {
				continue;
			}
			
			for(Node next : arr[now.to]) {
				if(dist[num][next.to] > now.cost + next.cost) {
					dist[num][next.to] = now.cost + next.cost;
					pq.add(new Node(next.to, dist[num][next.to]));
				}
			}
		}
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
