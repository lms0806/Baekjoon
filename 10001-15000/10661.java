import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int v;
	static ArrayList<Integer> answer;
	static ArrayList<Node>[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			v = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
		
			if(v == 0 && e == 0) {
				break;
			}
			
			answer = new ArrayList<>();
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
			prim();
			
			Collections.sort(answer);
			
			System.out.println(answer.get(answer.size() / 2));
		}
	}
	
	public static void prim() {
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
			
			if(now.cost != 0) {
				answer.add(now.cost);
			}
			
			cost += now.cost;
			visited[now.to] = true;
			
			if(++count == v - 1) {
				return;
			}
			
			for(Node a : arr[now.to]) {
				pq.add(a);
			}
		}
		return;
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
