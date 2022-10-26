import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int v;
	static ArrayList<int[]>[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		v = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken()) + 1;
		
		arr = new ArrayList[v + 1];
		for(int i = 0; i <= v; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(e --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken()) == 0 ? 1 : 0;
			
			arr[a].add(new int[] {b, cost});
			arr[b].add(new int[] {a, cost});
		}
		
		System.out.println((int)(Math.pow(prim(1), 2) - Math.pow(prim(0), 2)));
	}
	
	public static long prim(int num) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		boolean[] visited = new boolean[v + 1];
		pq.add(new Node(0, 0, num));
		
		long cost = 0;
		int count = 0;
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(visited[now.to]) {
				continue;
			}
			
			cost += now.cost;
			visited[now.to] = true;
			if(++count == v + 1) {
				return cost;
			}
			for(int[] a : arr[now.to]) {
				if(visited[a[0]]) {
					continue;
				}
				pq.add(new Node(a[0], a[1], num));
			}
		}
		return cost;
	}
}

class Node implements Comparable<Node>{
	int to, cost, choice;
	
	public Node(int to, int cost, int choice) {
		this.to = to;
		this.cost = cost;
		this.choice = choice;
	}

	@Override
	public int compareTo(Node o) {
		return this.choice == 0 ? this.cost - o.cost : o.cost - this.cost;
	}
}
