import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static ArrayList<Node>[] arr;
	static HashMap<Long, Long>[] map;
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		map = new HashMap[n + 1];
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			map[i] = new HashMap<>();
			arr[i] = new ArrayList<>();
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			long cost = Integer.parseInt(st.nextToken());
			
			arr[a].add(new Node(b, cost, 0));
			arr[b].add(new Node(a, cost, 0));
			
			map[a].put(cost, Long.MAX_VALUE);
			map[b].put(cost, Long.MAX_VALUE);
		}
		
		st = new StringTokenizer(br.readLine());
		
		long result = dijkstra(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		
		System.out.print(result == Long.MAX_VALUE ? "DIGESTA" : result);
	}
	
	public static long dijkstra(int start, int end) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		
		pq.add(new Node(start, 0, 0));
		map[start].put((long)0, (long)0);
		
		long answer = Long.MAX_VALUE;
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(now.cost > map[now.to].get(now.prev)) {
				continue;
			}
			
			if(now.to == end) {
				answer = Math.min(answer, now.cost);
			}
			
			for(Node a : arr[now.to]) {
				if(map[a.to].get(a.cost) > now.cost + a.cost && now.prev < a.cost) {
					map[a.to].put(a.cost, now.cost + a.cost);
					pq.add(new Node(a.to, map[a.to].get(a.cost), a.cost));
				}
			}
		}
		return answer;
	}
}

class Node implements Comparable<Node>{
	int to;
	long cost, prev;
	
	public Node(int to, long cost, long prev) {
		this.to = to;
		this.cost = cost;
		this.prev = prev;
	}
	
	@Override
	public int compareTo(Node o) {
		return (int)(this.cost - o.cost);
	}
}
