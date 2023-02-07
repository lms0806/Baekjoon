import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int seerfood, kist;
	static ArrayList<Node>[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			n = Integer.parseInt(st.nextToken());
			String start = st.nextToken(), end = st.nextToken();
			
			arr = new ArrayList[n];
			for(int i = 0; i < n; i++) {
				arr[i] = new ArrayList<>();
			}
			
			int idx = 0;
			HashMap<String, Integer> map = new HashMap<>();
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				String a = st.nextToken(), b = st.nextToken();
				int cost = Integer.parseInt(st.nextToken());
				
				if(!map.containsKey(a)) {
					map.put(a, idx++);
				}
				if(!map.containsKey(b)) {
					map.put(b, idx++);
				}
				
				arr[map.get(a)].add(new Node(map.get(b), cost));
				arr[map.get(b)].add(new Node(map.get(a), cost));
			}
			
			sb.append(start).append(" ").append(end).append(" ").append(dijkstra(map.get(start), map.get(end))).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int dijkstra(int start, int end) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int[] dist = new int[n];
		
		Arrays.fill(dist, Integer.MAX_VALUE);
		
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
		
		return dist[end];
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
