import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n, INF = 1000000000;
	static int max = INF, answer = 0;
	static int[] dist;
	static boolean[] visited;
	static ArrayList<Node>[] arr;
	static HashSet<Integer> home = new HashSet<>();
	static PriorityQueue<Node> pq = new PriorityQueue<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n + 1];
		dist = new int[n + 1];
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		Arrays.fill(dist, INF);
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			arr[a].add(new Node(b, cost));
			arr[b].add(new Node(a, cost));
		}
		
		st = new StringTokenizer(br.readLine());
		int p = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		while(p --> 0) {
			home.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		while(q --> 0) {
			int conv = Integer.parseInt(st.nextToken());
			pq.add(new Node(conv, 0));
			dist[conv] = 0;
			visited[conv] = true;
		}
		
		dijkstra();
		
		System.out.print(answer);
    }
	
	public static void dijkstra() {
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			int cur = now.start;
			
			if(home.contains(cur)) {
				if(max > dist[cur]) {
					answer = cur;
					max = dist[cur];
				}
				else if(max == dist[cur]) {
					answer = Math.min(answer, cur);
				}
			}
			
			for(Node a : arr[cur]) {
				if(!visited[a.start] && dist[a.start] > dist[cur] + a.cost) {
					dist[a.start] = dist[cur] + a.cost;
					pq.add(new Node(a.start, dist[a.start]));
				}
			}
		}
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
