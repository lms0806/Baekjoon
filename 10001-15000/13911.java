import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int stardist, mackdist;
	static int[][] dist;
	static ArrayList<Node>[] arr;
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		
		dist = new int[2][n + 3];
		for(int i = 0; i < 2; i++) {
			Arrays.fill(dist[i], 100000000);
		}
		
		arr = new ArrayList[n + 3];
		for(int i = 1; i < n + 3; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(e --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			arr[a].add(new Node(b, c));
			arr[b].add(new Node(a, c));
		}
		
		boolean[] flag = new boolean[n + 1];
		
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		mackdist = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int mack = Integer.parseInt(st.nextToken());
			arr[n + 1].add(new Node(mack, 0));
			flag[mack] = true;
		}
		
		st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken());
		stardist = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < s; i++) {
			int star = Integer.parseInt(st.nextToken());
			arr[n + 2].add(new Node(star, 0));
			flag[star] = true;
		}
		
		dijkstra(n + 1, 0);
		dijkstra(n + 2, 1);
		
		int answer = 100000000;
		for(int i = 1; i <= n; i++) {
			if(!flag[i]) {
				answer = Math.min(answer, dist[0][i] + dist[1][i]);
			}
		}
		System.out.print(answer == 100000000 ? -1 : answer);
	}
	
	public static void dijkstra(int start, int idx) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		
		dist[idx][start] = 0;
		pq.add(new Node(start, 0));
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(dist[idx][now.to] < now.cost) {
				continue;
			}
			
			for(Node next : arr[now.to]) {
				int cost = dist[idx][now.to] + next.cost;
				
				if((idx == 0 && cost > mackdist) || (idx == 1 && cost > stardist)) {
					continue;
				}
				
				if(dist[idx][next.to] > cost) {
					dist[idx][next.to] = cost;
					pq.add(new Node(next.to, dist[idx][next.to]));
				}
			}
		}
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
