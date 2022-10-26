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
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			v = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());
			
			arr = new ArrayList[v + 1];
			for(int i = 1; i <= v; i++) {
				arr[i] = new ArrayList<>();
			}
			
			while(e --> 0) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
				int cost = Integer.parseInt(st.nextToken());
				
				arr[a].add(new int[] {b, cost});
				arr[b].add(new int[] {a, cost});
			}
			
			sb.append(prim(start, end)? "YES" : "NO").append("\n");
		}
		System.out.print(sb);
	}
	
	public static boolean prim(int start, int end) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		boolean[] visited = new boolean[v + 1];
		pq.add(new Node(1, 1, 0));
		
		boolean flag = false;
		int count = 0;
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(visited[now.to]) {
				continue;
			}
			
			if(now.from == start && now.to == end) {
				flag = true;
			}
			visited[now.to] = true;
			
			if(++count == v) {
				return flag;
			}
			
			for(int[] a : arr[now.to]) {
				if(visited[a[0]]) {
					continue;
				}
				pq.add(new Node(now.to, a[0], a[1]));
			}
		}
		return flag;
	}
}

class Node implements Comparable<Node>{
	int from, to, cost;
	
	public Node(int from, int to, int cost) {
		this.from = from;
		this.to = to;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node o) {
		return this.cost - o.cost;
	}
}
