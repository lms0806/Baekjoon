import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static boolean[][] check;
	static ArrayList<Node>[] arr;
	static ArrayList<Integer>[] remove;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			if(n == 0 && m == 0) {
				break;
			}
			
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
			
			arr = new ArrayList[n];
			remove = new ArrayList[n];
			check = new boolean[n][n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = new ArrayList<>();
				remove[i] = new ArrayList<>();
			}
			
			while(m --> 0) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
				int cost = Integer.parseInt(st.nextToken());
				
				arr[a].add(new Node(b, cost));
			}
			
			dijkstra(s, e);
			checking(s, e);
			
			sb.append(dijkstra(s, e)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void checking(int s, int e) {
		if(s == e) {
			return;
		}
		
		for(int next : remove[e]) {
			if(!check[next][e]) {
				check[next][e] = true;
				checking(s, next);
			}
		}
	}
	
	public static int dijkstra(int s, int e) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int[] dist = new int[n];
		
		Arrays.fill(dist, 500000);
		
		pq.add(new Node(s, 0));
		dist[s] = 0;
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(dist[now.end] > now.cost) {
				continue;
			}
			
			if(now.end == e) {
				return now.cost;
			}
			
			for(Node next : arr[now.end]) {
				if(check[now.end][next.end]) {
					continue;
				}
				
				if(dist[next.end] > dist[now.end] + next.cost) {
					dist[next.end] = dist[now.end] + next.cost;
					pq.add(new Node(next.end, dist[next.end]));
					remove[next.end] = new ArrayList<>();
					remove[next.end].add(now.end);
				}
				else if(dist[next.end] == dist[now.end] + next.cost) {
					remove[next.end].add(now.end);
				}
			}
		}
		
		return -1;
	}
}

class Node implements Comparable<Node> {
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
