import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node>{
    int to, weight;

    public Node(int to, int weight){
        this.to = to;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        return weight - o.weight;
    }
}

public class Main {
	static int n, m;
	static int[] dist;
	static List<Node>[] list;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		
		dist = new int[n + 1];
		list = new ArrayList[n + 1];
		
		Arrays.fill(dist, Integer.MAX_VALUE);
		
		for(int i = 1; i <= n; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			list[Integer.parseInt(st.nextToken())].add(new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		System.out.print(dijkstra(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
	}
	
	public static int dijkstra(int start, int end) {
		PriorityQueue<Node> queue = new PriorityQueue<>();
		boolean[] check = new boolean[n + 1];
		queue.add(new Node(start, 0));
		dist[start] = 0;
		
		while(!queue.isEmpty()) {
			int cur = queue.poll().to;
			
			if(check[cur]) {
				continue;
			}
			
			check[cur] = true;
				
			for(Node node : list[cur]) {
				if(!check[node.to] && dist[node.to] > dist[cur] + node.weight) {
					dist[node.to] = dist[cur] + node.weight;
					queue.add(new Node(node.to, dist[node.to]));
				}
			}
		}
		return dist[end];
	}
}
