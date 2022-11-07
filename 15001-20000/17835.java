import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static long[] dist;
	static ArrayList<Node>[] arr;
	static PriorityQueue<Node> pq = new PriorityQueue<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		dist = new long[n + 1];
		Arrays.fill(dist, Long.MAX_VALUE);
		
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			arr[b].add(new Node(a, cost));
		}
		
		st = new StringTokenizer(br.readLine());
		while(k --> 0) {
			int num = Integer.parseInt(st.nextToken());
			dist[num] = 0;
			pq.add(new Node(num, 0));
		}
		
		System.out.print(dijkstra());
	}
	
	public static String dijkstra() {		
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
		
		long answer = 0;
		int idx = 0;
		for(int i = 1; i <= n; i++) {
			if(dist[i] > answer) {
				answer = dist[i];
				idx = i;
			}
		}
		
		return idx + "\n" + answer;
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
