import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Point>[] arr;
	static boolean[] visited;
	static int n, answer;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
			int v = Integer.parseInt(st.nextToken());
			
			arr[a].add(new Point(b, v));
			arr[b].add(new Point(a, v));
		}
		
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			visited = new boolean[n];
			answer = -1;
			
			st = new StringTokenizer(br.readLine());
			bfs(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) - 1);
			
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void bfs(int k, int v) {
		Queue<Integer> queue = new LinkedList<>();
		visited[v] = true;
		queue.add(v);
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			answer++;
			for(Point a : arr[now]) {
				if(!visited[a.x] && a.y >= k) {
					visited[a.x] = true;
					queue.add(a.x);
				}
			}
		}
	}
}
