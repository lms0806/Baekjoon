import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n, k;
	static long answer = Long.MAX_VALUE;
	static ArrayList<int[]>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			arr[a].add(new int[] {b, cost});
			arr[b].add(new int[] {a, cost});
		}
		
		bfs();
		
		System.out.print(answer);
    }
	
	public static void bfs() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		long[][] dist = new long[n + 1][k + 1];
		pq.add(new Node(1, 0, 0));
		
		for(int i = 1; i <= n; i++) {
			Arrays.fill(dist[i], Long.MAX_VALUE);
		}
		dist[1][0] = 0;
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(now.cost > dist[now.start][now.count]) {
				continue;
			}
			
			if(now.start == n && now.count <= k) {
				answer = Math.min(answer, now.cost);
				continue;
			}
			
			for(int[] a : arr[now.start]) {
				int next = a[0], cost = a[1];
				if(now.count < k && dist[next][now.count + 1] > dist[now.start][now.count]) {
					dist[next][now.count + 1] = dist[now.start][now.count];
					pq.add(new Node(next, dist[next][now.count + 1], now.count + 1));
				}
				
				if(dist[next][now.count] > dist[now.start][now.count] + cost) {
					dist[next][now.count] = dist[now.start][now.count] + cost;
					pq.add(new Node(next, dist[next][now.count], now.count));
				}
				
			}
		}
	}
}

class Node implements Comparable<Node>{
	int start, count;
	long cost;
	
	public Node(int start, long cost, int count) {
		this.start = start;
		this.cost = cost;
		this.count = count;
	}

	@Override
	public int compareTo(Node o) {
		return (int)(this.cost - o.cost);
	}
}
