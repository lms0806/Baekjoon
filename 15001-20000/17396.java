import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static ArrayList<Point>[] arr;
	static boolean[] watch;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		watch = new boolean[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			watch[i] = Integer.parseInt(st.nextToken()) == 1 ? true : false;
		}
		
		arr = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			arr[a].add(new Point(b, cost));
			arr[b].add(new Point(a, cost));
		}
		
		solve();
	}
	
	public static void solve() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		long[] dist = new long[n];
		boolean[] visited = new boolean[n];
		pq.add(new Node(0, 0));
		
		Arrays.fill(dist, Long.MAX_VALUE);
		dist[0] = 0;
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(visited[now.x]) {
				continue;
			}
			
			visited[now.x] = true;
			for(Point a : arr[now.x]) {
				if(!(watch[a.x] && a.x != n - 1) && dist[a.x] > now.cost + a.y) {
					pq.add(new Node(a.x, now.cost + a.y));
					dist[a.x] = now.cost + a.y;
				}
			}
		}
		System.out.print(dist[n - 1] == Long.MAX_VALUE ? -1 : dist[n - 1]);
	}
}
class Node implements Comparable<Node>{
	int x;
	long cost;
	
	public Node(int x, long cost) {
		this.x = x;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node o) {
		return (int)(this.cost - o.cost);
	}
}
