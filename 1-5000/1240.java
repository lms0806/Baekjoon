import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static boolean[] visited;
	static ArrayList<Point>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			arr[start].add(new Point(end, cost));
			arr[end].add(new Point(start, cost));
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());
			
			visited = new boolean[n + 1];
			
			sb.append(bfs(start, end)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int bfs(int start, int end) {
		Queue<Point> queue = new LinkedList<>();
		queue.add(new Point(start, 0));
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			Point now = queue.poll();
			
			if(now.x == end) {
				return now.y;
			}
			
			for(Point temp : arr[now.x]) {
				if(!visited[temp.x]) {
					queue.add(new Point(temp.x, now.y + temp.y));
					visited[temp.x] = true;
				}
			}
		}
		return 0;
	}
}
