import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int v, total;
	static ArrayList<Node>[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			v = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			total = 0;
			
			if(v == 0 && e == 0) {
				break;
			}
			
			arr = new ArrayList[v];
			for(int i = 0; i < v; i++) {
				arr[i] = new ArrayList<>();
			}
			
			while(e --> 0) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
				int cost = Integer.parseInt(st.nextToken());
					
				arr[a].add(new Node(b, cost));
				arr[b].add(new Node(a, cost));
				total += cost;
			}
			
			sb.append(prim()).append("\n");
		}
		System.out.print(sb);
	}
	
	public static long prim() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		boolean[] visited = new boolean[v + 1];
		pq.add(new Node(0, 0));
		
		int cost = 0;
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(visited[now.to]) {
				continue;
			}
			
			cost += now.cost;
			visited[now.to] = true;
			
			for(Node a : arr[now.to]) {
				pq.add(a);
			}
		}
		return total - cost;
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
