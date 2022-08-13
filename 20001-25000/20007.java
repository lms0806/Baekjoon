import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n, x;
	static ArrayList<Point>[] arr;
	static int[] dist;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		dist = new int[n];
		Arrays.fill(dist, Integer.MAX_VALUE);
		
		arr = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			arr[a].add(new Point(b, cost));
			arr[b].add(new Point(a, cost));
		}
		
		dijkstra(y);
		
		Arrays.sort(dist);
		
		int total = 0, answer = 1;
		for(int d : dist) {
			int num = d * 2;
			
			if(num > x) {
				answer = -1;
				break;
			}
			
			total += num;
			
			if(total > x) {
				answer++;
				total = num;
			}
		}
		
		System.out.print(answer);
	}
	
	public static void dijkstra(int y) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		boolean[] visited = new boolean[n];
		pq.add(new Node(y, 0));
		dist[y] = 0;
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			for(Point p : arr[now.which]) {
				if(!visited[p.x] && now.cost + p.y < dist[p.x]) {
					dist[p.x] = now.cost + p.y;
					pq.add(new Node(p.x, dist[p.x]));
				}
			}
			
			visited[now.which] = true;
		}
	}
}

class Node implements Comparable<Node>{
	int which, cost;
	
	public Node(int which, int cost) {
		this.which = which;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node o) {
		return this.cost - o.cost;
	}
}
