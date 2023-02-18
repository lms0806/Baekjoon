import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[] dist, parent;
	static ArrayList<Node>[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		n = Integer.parseInt(br.readLine());
		
		dist = new int[n + 1];
		parent = new int[n + 1];
		
		Arrays.fill(dist, Integer.MAX_VALUE);
		
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		int m = Integer.parseInt(br.readLine());
		
		while(m --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			arr[b].add(new Node(a, cost));
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int end = Integer.parseInt(st.nextToken()), start = Integer.parseInt(st.nextToken());
		dijkstra(start);
		
		StringBuilder answer = new StringBuilder();
		answer.append(dist[end]).append("\n");
		
		int count = 1;
		StringBuilder sb = new StringBuilder();
		while(parent[end] != 0) {
			sb.append(end).append(" ");
			
			end = parent[end];
			count++;
		}
		sb.append(end);
		
		answer.append(count).append("\n").append(sb);
		
		System.out.print(answer);
	}
	
	public static void dijkstra(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(start, 0));
		dist[start] = 0;
		parent[start] = 0;
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(dist[now.to] < now.cost) {
				continue;
			}
			
			for(Node next : arr[now.to]) {
				if(dist[next.to] > dist[now.to] + next.cost) {
					dist[next.to] = dist[now.to] + next.cost;
					pq.add(new Node(next.to, dist[next.to]));
					parent[next.to] = now.to;
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
