import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static ArrayList<Node>[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		n = Integer.parseInt(br.readLine());
		
		arr = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		ArrayList<int[]> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			list.add(new int[] {i, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
		}
		
		for(int idx = 1; idx < 4; idx++) {
			int index = idx;
			Collections.sort(list, (o1, o2) -> o1[index] - o2[index]);
			
			for(int i = 0; i < n - 1; i++) {
				int cost = Math.abs(list.get(i)[idx] - list.get(i + 1)[idx]);
				
				arr[list.get(i)[0]].add(new Node(list.get(i + 1)[0], cost));
				arr[list.get(i + 1)[0]].add(new Node(list.get(i)[0], cost));
			}
		}
		
		System.out.print(prim());
	}
	
	public static long prim() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		boolean[] visited = new boolean[n];
		pq.add(new Node(0, 0));
		
		long cost = 0;
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(visited[now.to]) {
				continue;
			}
			
			cost += now.cost;
			visited[now.to] = true;
			
			for(Node a : arr[now.to]) {
				if(visited[a.to]) {
					continue;
				}
				pq.add(a);
			}
		}
		return cost;
	}
}

class Node implements Comparable<Node>{
	int to;
	long cost;
	
	public Node(int to, long cost) {
		this.to = to;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node o) {
		return (int) (this.cost - o.cost);
	}
}
