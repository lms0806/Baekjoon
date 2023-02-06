import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n, t, start;
	static int[] dist;
	static ArrayList<Node>[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine().trim());
		start = Integer.parseInt(br.readLine());
		t = Integer.parseInt(br.readLine().trim());
		
		arr = new ArrayList[101];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		dist = new int[101];
		Arrays.fill(dist, 2000000000);
		
		int m = Integer.parseInt(br.readLine());
		
		while(m --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			int cost = Integer.parseInt(st.nextToken());
			
			arr[b].add(new Node(a, cost));
		}
		
		dijkstra();
		
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			if(dist[i] <= t) {
				answer++;
			}
		}
		System.out.print(answer);
	}
	
	public static void dijkstra() {
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
