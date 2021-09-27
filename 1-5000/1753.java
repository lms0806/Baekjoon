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
	static int[] dist;
	static List<Node>[] list;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int v = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
		
		dist = new int[v + 1];
		list = new ArrayList[v + 1];
		
		Arrays.fill(dist, Integer.MAX_VALUE);
		
		for(int i = 1; i <= v; i++) {
			list[i] = new ArrayList<>();
		}
		
		int k = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < e; i++) {
			st = new StringTokenizer(br.readLine());
			list[Integer.parseInt(st.nextToken())].add(new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		dijkstra(v, k);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= v; i++) {
			sb.append(dist[i] == Integer.MAX_VALUE ? "INF" : dist[i]).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void dijkstra(int v, int start) {
		PriorityQueue<Node> queue = new PriorityQueue<>();
		boolean[] check = new boolean[v + 1];
		queue.add(new Node(start, 0));
		dist[start] = 0;
		
		while(!queue.isEmpty()) {
			int cur = queue.poll().to;
			
			if(check[cur]) {
				continue;
			}
			
			check[cur] = true;
				
			for(Node node : list[cur]) {
				if(dist[node.to] > dist[cur] + node.weight) {
					dist[node.to] = dist[cur] + node.weight;
					queue.add(new Node(node.to, dist[node.to]));
				}
			}
		}
	}
}
