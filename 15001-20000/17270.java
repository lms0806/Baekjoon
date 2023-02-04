import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[] jdist, sdist;
	static ArrayList<Node>[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		jdist = new int[n];
		sdist = new int[n];
		
		Arrays.fill(jdist, Integer.MAX_VALUE);
		Arrays.fill(sdist, Integer.MAX_VALUE);
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
			int cost = Integer.parseInt(st.nextToken());
			
			arr[a].add(new Node(b, cost));
			arr[b].add(new Node(a, cost));
		}
		
		st = new StringTokenizer(br.readLine());
		int j = Integer.parseInt(st.nextToken()) - 1, s = Integer.parseInt(st.nextToken()) - 1;
		
		dijkstra(j, jdist);
		dijkstra(s, sdist);
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			if(i == j || i == s) {
				continue;
			}
			
			if(min > jdist[i] + sdist[i]) {
				min = jdist[i] + sdist[i];
			}
		}
		
		int dist = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			if(i == j || i == s) {
				continue;
			}
			if(min == jdist[i] + sdist[i] && jdist[i] <= sdist[i] && dist > jdist[i]) {
				dist = jdist[i];
			}
		}
		
		int answer = -1;
		for(int i = 0; i < n; i++) {
			if(i == j || i == s) {
				continue;
			}
			
			if(min == jdist[i] + sdist[i] && dist == jdist[i]) {
				answer = i + 1;
				break;
			}
		}
		
		System.out.print(answer);
	}
	
	public static void dijkstra(int start, int[] dist) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(start, 0));
		dist[start] = 0;
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(dist[now.to] < now.cost) {
				continue;
			}
			
			for(Node next : arr[now.to]) {
				if(dist[next.to] > dist[now.to] + next.cost) {
					dist[next.to] = dist[now.to] + next.cost;
					pq.add(new Node(next.to, dist[next.to]));
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
