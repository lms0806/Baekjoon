import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, s, p, q;
	static int[] dangerous_city;
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		p = Integer.parseInt(st.nextToken());
		q = Integer.parseInt(st.nextToken());
		
		
		dangerous_city = new int[n + 1];
		arr = new ArrayList[n + 1];
		
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(k --> 0) {
			int gombi = Integer.parseInt(br.readLine());
			dangerous_city[gombi] = 2;
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		bfs();
		
		System.out.print(Dijkstra());
	}
	
	public static void bfs() {
		Queue<int[]> queue = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) {
			if(dangerous_city[i] == 2) {
				queue.add(new int[] {i, 0});
			}
		}
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[1] == s) {
				continue;
			}
			
			for(int next : arr[now[0]]) {
				if(dangerous_city[next] == 0) {
					dangerous_city[next] = 1;
					queue.add(new int[] {next, now[1] + 1});
				}
			}
		}
	}
	
	public static long Dijkstra() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		long[] dist = new long[n + 1];
		
		Arrays.fill(dist, (long)(2e10));
		
		pq.add(new Node(1, 0));
		dist[1] = 0;
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(now.cost < dist[now.to]) {
				continue;
			}
			
			for(int next : arr[now.to]) {
				if(dangerous_city[next] == 2) {
					continue;
				}
				int cost = next == n ? 0 : dangerous_city[next] == 0 ? p : q;
				
				if(dist[next] > dist[now.to] + cost) {
					dist[next] = dist[now.to] + cost;
					pq.add(new Node(next, dist[next]));
				}
			}
		}
		
		return dist[n];
	}
}

class Node implements Comparable<Node>{
	int to;
	long cost;
	
	public Node(int to, long cost) {
		this.to = to;
		this.cost = cost;
	}
	
	@Override
	public int compareTo(Node o) {
		return (int) (this.cost - o.cost);
	}
}
