import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static ArrayList<Node>[] arr;
	static int[] dist;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		dist = new int[n + 1];
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int choice = Integer.parseInt(st.nextToken());
			
			if(choice == 1) {
				int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
				int cost = Integer.parseInt(st.nextToken());
				
				arr[a].add(new Node(b, cost));
				arr[b].add(new Node(a, cost));
			}
			else {
				sb.append(bfs(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))).append("\n");
			}
		}
		System.out.print(sb);
	}
	
	public static int bfs(int start, int end) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		
		Arrays.fill(dist, 100000000);
		dist[start] = 0;
		
		pq.add(new Node(start, 0));
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			int cur = now.end;
			
			if(dist[cur] < now.cost) {
				continue;
			}
			
			for(Node node : arr[cur]) {
				int next = node.end;
				int cost = node.cost;
				
				if(dist[next] > dist[cur] + cost) {
					dist[next] = dist[cur] + cost;
					pq.add(new Node(next, dist[next]));
				}
			}
		}
		
		return dist[end] == 100000000 ? -1 : dist[end];
	}
}

class Node implements Comparable<Node>{
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
