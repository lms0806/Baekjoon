import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n, INF = 100000000;
	static ArrayList<Node>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		int[] array = new int[3];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int m = Integer.parseInt(br.readLine());
		
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			arr[a].add(new Node(b, cost));
			arr[b].add(new Node(a, cost));
		}
		
		int[] d1 = dijkstra(array[0]);
		int[] d2 = dijkstra(array[1]);
		int[] d3 = dijkstra(array[2]);
		
		int max = -1, idx = -1;
		for(int i = 1; i <= n; i++) {
			int a = d1[i], b = d2[i], c = d3[i];
			
			int min = Math.min(a, Math.min(b, c));
			
			if(max == min && idx > i) {
				idx = i;
			}
			else if(max < min) {
				max = min;
				idx = i;
			}
		}
		
		System.out.print(idx);
    }
	
	public static int[] dijkstra(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int[] dist = new int[n + 1];
		
		Arrays.fill(dist, INF);
		
		pq.add(new Node(start, 0));
		dist[start] = 0;
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(dist[now.start] < now.cost) {
				continue;
			}
			
			for(Node a : arr[now.start]) {
				if(dist[a.start] > dist[now.start] + a.cost) {
					dist[a.start] = dist[now.start] + a.cost;
					pq.add(new Node(a.start, dist[a.start]));
				}
			}
		}
		
		return dist;
	}
}

class Node implements Comparable<Node>{
	int start, cost;
	
	public Node(int start, int cost) {
		this.start = start;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node o) {
		return this.cost - o.cost;
	}
}
