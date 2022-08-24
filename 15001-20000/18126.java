import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static long answer;
	static boolean[] visited;
	static ArrayList<Point>[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		visited = new boolean[n];
		arr = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(n --> 1) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
			int cost = Integer.parseInt(st.nextToken());
			
			arr[a].add(new Point(b, cost));
			arr[b].add(new Point(a, cost));
		}
		
		dfs(0, 0);
		
		System.out.print(answer);
	}
	
	public static void dfs(int start, long dist) {
		if(answer < dist) {
			answer = dist;
		}
		
		visited[start] = true;
		
		for(Point a : arr[start]) {
			if(!visited[a.x]) {
				visited[a.x] = true;
				dfs(a.x, dist + a.y);
			}
		}
	}
}
