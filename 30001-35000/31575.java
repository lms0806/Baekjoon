import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static boolean[][] visited;
	static int[][] arr;
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.print(bfs(0, 0));
	}
	
	public static String bfs(int x, int y) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(new Node(x, y));
		visited[x][y] = true;
		
		int[] dx = {1, 0};
		int[] dy = {0, 1};
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			
			if(now.x == n - 1 && now.y == m - 1) {
				return "Yes";
			}
			
			for(int i = 0; i < 2; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny] && arr[nx][ny] == 1) {
					queue.add(new Node(nx, ny));
					visited[nx][ny] = true;
				}
			}
		}
		
		return "No";
	}
}

class Node {
	int x, y;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
