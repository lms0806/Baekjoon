import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		long[] arr = new long[n + 1];
		boolean[] visited = new boolean[n + 1];
		ArrayList<Node>[] list = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			list[i] = new ArrayList<>();
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		int p = Integer.parseInt(br.readLine());
		
		while(p --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			long t = Long.parseLong(st.nextToken());
			
			arr[b] += t;
			list[a].add(new Node(b, t));
		}
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		for(int i = 1; i <= n; i++) {
			pq.add(new Node(i, arr[i]));
		}
		
		long max = 0;
		int count = 0;
		while(count < m) {
			Node now = pq.poll();
			
			if(visited[now.b]) {
				continue;
			}
			
			visited[now.b] = true;
			max = Math.max(max, now.t);
			
			for(Node next : list[now.b]) {
				if(!visited[next.b]) {
					arr[next.b] -= next.t;
					pq.add(new Node(next.b, arr[next.b]));
				}
			}
			count++;
		}
		System.out.print(max);
	}
}

class Node implements Comparable<Node>{
	int b;
	long t;
	
	public Node(int b, long t) {
		this.b = b;
		this.t = t;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.t < o.t) {
			return -1;
		}
		return this.t == o.t ? 0 : 1;
	}
}
