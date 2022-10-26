import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int v, plus;
	static ArrayList<Node>[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		v = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		plus = Integer.parseInt(st.nextToken());
	
		arr = new ArrayList[v + 1];
		for(int i = 1; i <= v; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(e --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
				
			arr[a].add(new Node(b, cost));
			arr[b].add(new Node(a, cost));
		}
		
		System.out.print(prim());
	}
	
	public static long prim() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		boolean[] visited = new boolean[v + 1];
		pq.add(new Node(1, 0));
		
		long cost = 0;
		int count = -1;
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(visited[now.to]) {
				continue;
			}
			
			cost += now.cost + (now.to == 1 ? 0 : count * plus);
			visited[now.to] = true;
			
			if(++count == v - 1) {
				return cost;
			}
			
			for(Node a : arr[now.to]) {
				pq.add(a);
			}
		}
		return -1;
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
