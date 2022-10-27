import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static ArrayList<int[]>[] arr;
	static PriorityQueue<Node> pq = new PriorityQueue<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		while(k --> 0) {
			pq.add(new Node(Integer.parseInt(st.nextToken()), 0));
		}
		
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
		
		System.out.print(prim());
	}
	
	public static long prim() {
		boolean[] visited = new boolean[n + 1];
		
		long cost = 0;
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(visited[now.to]) {
				continue;
			}
			
			cost += now.cost;
			visited[now.to] = true;
			
			for(int[] a : arr[now.to]) {
				pq.add(new Node(a[0], a[1]));
			}
		}
		return cost;
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
