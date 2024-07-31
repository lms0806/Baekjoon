import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static ArrayList<Node>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[a].add(new Node(b, i));
			arr[b].add(new Node(a, i));
		}
		
		System.out.print(dijkstra());
	}
	
	public static long dijkstra() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		long[] dist = new long[n + 1];
		
		Arrays.fill(dist, Long.MAX_VALUE);
		
		dist[1] = 0;
		pq.add(new Node(1, 0));
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(now.x == n) {
				return now.time;
			}
			
			for(Node next : arr[now.x]) {
				long cost = now.time + (next.time - now.time % m + m) % m + 1;
				if(dist[next.x] > cost) {
					dist[next.x] = cost;
					pq.add(new Node(next.x, dist[next.x]));
				}
			}
		}
		return -1;
	}
}

class Node implements Comparable<Node> {
	int x;
	long time;
	
	public Node(int x, long time) {
		this.x = x;
		this.time = time;
	}

	@Override
	public int compareTo(Node o) {
		return (int) (this.time - o.time);
	}
}
