import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[] road, dist;
	static ArrayList<Node>[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());
		
		StringBuilder answer = new StringBuilder();
		for(int t = 1; t <= test; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			
			road = new int[n];
			dist = new int[n];
			arr = new ArrayList[n];
			for(int i = 0; i < n; i++) {
				arr[i] = new ArrayList<>();
			}
			Arrays.fill(road, - 1);
			
			while(m --> 0) {
				st = new StringTokenizer(br.readLine());
				int s = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
				int cost = Integer.parseInt(st.nextToken());
				
				arr[s].add(new Node(e, cost));
				arr[e].add(new Node(s, cost));
			}
			
			dijkstra();
			
			answer.append(String.format("Case #%d: ", t));
			StringBuilder sb = new StringBuilder();
			if(dist[n - 1] == Integer.MAX_VALUE) {
				sb.append(-1);
			}
			else {
				Stack<Integer> stack = new Stack<>();
				int idx = n - 1;
				while(idx != 0) {
					stack.add(idx = road[idx]);
				}
				
				while(!stack.isEmpty()) {
					sb.append(stack.pop()).append(" ");
				}
				sb.append(n - 1);
			}
			answer.append(sb).append("\n");
		}
		System.out.print(answer);
	}
	
	public static void dijkstra() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		
		Arrays.fill(dist, Integer.MAX_VALUE);
		
		dist[0] = 0;
		pq.add(new Node(0, 0));
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(dist[now.e] < now.cost) {
				continue;
			}
			
			for(Node next : arr[now.e]) {
				if(dist[next.e] > dist[now.e] + next.cost) {
					dist[next.e] = dist[now.e] + next.cost;
					pq.add(new Node(next.e, dist[next.e]));
					road[next.e] = now.e;
				}
			}
		}
	}
}

class Node implements Comparable<Node> {
	int e, cost;
	
	public Node(int e, int cost) {
		this.e = e;
		this.cost = cost;
	}
	
	@Override
	public int compareTo(Node o) {
		return this.cost - o.cost;
	}
}
