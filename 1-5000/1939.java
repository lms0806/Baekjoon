import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m, start, end;
	static ArrayList<Node>[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		int high = 0;
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
			int value = Integer.parseInt(st.nextToken());
			
			arr[a].add(new Node(b, value));
			arr[b].add(new Node(a, value));
			
			high = Math.max(high, value);
		}
		
		st = new StringTokenizer(br.readLine());
		start = Integer.parseInt(st.nextToken()) - 1;
		end = Integer.parseInt(st.nextToken()) - 1;
		
		int low = 0;
		while(low <= high) {
			int mid = (low + high) / 2;
			
			if(bfs(mid)) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		
		System.out.print(high);
	}
	
	public static boolean bfs(int cost) {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[n];
		queue.add(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			if(now == end) {
				return true;
			}
			
			for(Node a : arr[now]) {
				if(!visited[a.edge] && cost <= a.cost) {
					visited[a.edge] = true;
					queue.add(a.edge);
				}
			}
		}
		return false;
	}
}

class Node{
	int edge;
	int cost;
	
	public Node(int edge, int cost) {
		this.edge = edge;
		this.cost = cost;
	}
}
