import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static boolean[] cycle;
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		n = Integer.parseInt(br.readLine());
		
		cycle = new boolean[n + 1];
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		for(int i = 1; i <= n; i++) {
			if(checkCycle(i, i, i)) {
				break;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			sb.append(cycle[i] ? 0 : bfs(i)).append(" ");
		}
		System.out.print(sb);
	}
	
	public static int bfs(int x) {
		Queue<Node> queue = new LinkedList<>();
		boolean[] visited = new boolean[n + 1];
		
		queue.add(new Node(x, 0));
		visited[x] = true;
		
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			
			if(cycle[now.idx]) {
				return now.dist;
			}
			
			for(int next : arr[now.idx]) {
				if(!visited[next]) {
					visited[next] = true;
					queue.add(new Node(next, now.dist + 1));
				}
			}
		}
		return -1;
	}
	
	public static boolean checkCycle(int start, int prev, int now) {
		cycle[now] = true;
		
		for(int next : arr[now]) {
			if(cycle[next] == false) {
				if(checkCycle(start, now, next)) {
					return true;
				}
			}
			else if(prev != next && next == start) {
				return true;
			}
		}
		
		cycle[now] = false;
		return false;
	}
}

class Node {
	int idx, dist;
	
	public Node(int idx, int dist) {
		this.idx = idx;
		this.dist = dist;
	}
}
