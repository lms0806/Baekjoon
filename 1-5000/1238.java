import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
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
	static int n, x;
	static ArrayList<ArrayList<Node>> list, reverse_list;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		
		list = new ArrayList<>();
		reverse_list = new ArrayList<>();
		
		for(int i = 0; i <= n; i++) {
			list.add(new ArrayList<>());
			reverse_list.add(new ArrayList<>());
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken()), weight = Integer.parseInt(st.nextToken());
			
			list.get(start).add(new Node(end, weight));
			reverse_list.get(end).add(new Node(start, weight));
		}
		
		int[] dist = dijkstra(list);
		int[] dist1 = dijkstra(reverse_list);
		
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			answer = Math.max(answer, dist[i] + dist1[i]);
		}
		System.out.print(answer);
	}
	
	public static int[] dijkstra(ArrayList<ArrayList<Node>> arr) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(x, 0));
		
		boolean[] check = new boolean[n + 1];
		int[] dist = new int[n + 1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[x] = 0;
		
		while(!pq.isEmpty()) {
			int cur = pq.poll().to;
	
			if(!check[cur]) {
				check[cur] = true;
				for(Node node : arr.get(cur)) {
					if(!check[node.to] && dist[node.to] > dist[cur] + node.weight) {
						dist[node.to] = dist[cur] + node.weight;
						pq.add(new Node(node.to, dist[node.to]));
					}
				}
			}
		}
		return dist;
	}
}
