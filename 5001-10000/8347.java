import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n, INF = 500000000;
	static ArrayList<int[]>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			arr[a].add(new int[] {b, cost});
			arr[b].add(new int[] {a, cost});
		}
		System.out.print(bfs());
	}
	
	public static int bfs() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int[][] dist = new int[2][n + 1];
		
		for(int i = 0; i < 2; i++) {
			Arrays.fill(dist[i], INF);
		}
		dist[0][1] = 0;
		pq.add(new Node(1, 0, 0));
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			int cur = now.end;
			int choice = now.choice;
			
			if(dist[now.choice][cur] < now.cost) {
				continue;
			}
			
			for(int i = 0; i < arr[cur].size(); i++) {
				int next = arr[cur].get(i)[0];
				int cost = arr[cur].get(i)[1];
				
				int nd = dist[choice][cur] + cost;
				
				if(dist[nd & 1][next] > nd) {
					dist[nd & 1][next] = nd;
					pq.add(new Node(next, nd, nd & 1));
				}
			}
		}
		
		return dist[1][n] == INF ? 0 : dist[1][n];
	}
}

class Node implements Comparable<Node>{
	int end, cost, choice;
	
	public Node(int end, int cost, int choice) {
		this.end = end;
		this.cost = cost;
		this.choice = choice;
	}

	@Override
	public int compareTo(Node o) {
		return this.cost - o.cost;
	}
}
