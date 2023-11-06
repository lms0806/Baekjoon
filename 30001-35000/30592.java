import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m, k;
	static int[][] dist;
	static char[][] board;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1}; 
	static int[] dx2 = {2, 0, -2, 0};
	static int[] dy2 = {0, 2, 0, -2};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		dist = new int[n][m];
		board = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		st = new StringTokenizer(br.readLine());
		int sx = Integer.parseInt(st.nextToken()), sy = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int ex = Integer.parseInt(st.nextToken()), ey = Integer.parseInt(st.nextToken());
				
		System.out.print(bfs(sx - 1, sy - 1, ex - 1, ey - 1) ? "YES" : "NO");
	}
	
	public static boolean bfs(int sx, int sy, int ex, int ey) {
		PriorityQueue<Node> queue = new PriorityQueue<>();
		
		for(int i = 0; i < n; i++) {
			Arrays.fill(dist[i], Integer.MAX_VALUE);
		}
		
		dist[sx][sy] = 0;
		queue.add(new Node(sx, sy, 0));
		
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			
			if(now.x == ex && now.y == ey) {
				return true;
			}
			
			if(now.cost < k) {
				for(int i = 0; i < 4; i++) {
					int nx = now.x + dx2[i];
					int ny = now.y + dy2[i];
					
					if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == '.') {
						if(dist[nx][ny] > dist[now.x][now.y] + 1) {
							dist[nx][ny] = dist[now.x][now.y] + 1;
							queue.add(new Node(nx, ny, dist[nx][ny]));
						}
					}
				}
			}
			for(int i = 0; i < 4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == '.') {
					if(dist[nx][ny] > dist[now.x][now.y]) {
						dist[nx][ny] = dist[now.x][now.y];
						queue.add(new Node(nx, ny, dist[nx][ny]));
					}
				}
			}
		}
		return false;
	}
}

class Node implements Comparable<Node>{
	int x, y, cost;
	
	public Node(int x, int y, int cost) {
		this.x = x;
		this.y = y;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node o) {
		return this.cost - o.cost;
	}
}
