import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int n, start;
	static int a, b;
	static boolean[] visited;
	static ArrayList<Node>[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n + 1];
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			arr[a].add(new Node(b, cost));
			arr[b].add(new Node(a, cost));
		}
		
		visited[start] = true;
		dfsa(start, 0);
		dfsb(start, 0);
		
		System.out.print(a + " " + b);
	}
	
	public static void dfsa(int now, int sum) {
		if(arr[now].size() > 2 || (arr[now].size() == 1 && now != start) || (arr[now].size() == 2 && now == start)) {
			a = sum;
			start = now;
			return;
		}
		
		for(Node next : arr[now]) {
			if(!visited[next.end]) {
				visited[next.end] = true;
				dfsa(next.end, sum + next.cost);
			}
		}
	}
	
	public static void dfsb(int now, int sum) {
		if(arr[now].size() == 1) {
			b = Math.max(b, sum);
		}
		
		for(Node next : arr[now]) {
			if(!visited[next.end]) {
				visited[next.end] = true;
				sum += next.cost;
				dfsb(next.end, sum);
				sum -= next.cost;
				visited[next.end] = false;
			}
		}
	}
}

class Node{
	int end, cost;
	
	public Node(int end, int cost) {
		this.end = end;
		this.cost = cost;
	}
}
