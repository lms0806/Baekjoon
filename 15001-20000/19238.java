import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m, oil;
	static int[][] board;
	static Point[] start, end;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		oil = Integer.parseInt(st.nextToken());
		
		board = new int[n + 1][n + 1];
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= n; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
		
		start = new Point[m];
		end = new Point[m];
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int sx = Integer.parseInt(st.nextToken()), sy = Integer.parseInt(st.nextToken());
			int ex = Integer.parseInt(st.nextToken()), ey = Integer.parseInt(st.nextToken());
			
			start[i] = new Point(sx, sy);
			end[i] = new Point(ex, ey);
		}
		
		System.out.print(solve(x, y));
	}
	
	public static int solve(int x, int y) {
		boolean[] flag = new boolean[m];
		for(int t = 0; t < m; t++) {
			int idx = 0, count = Integer.MAX_VALUE;
			int idxx = Integer.MAX_VALUE, idxy = Integer.MAX_VALUE;
			for(int i = 0; i < m; i++) {
				if(flag[i]) {
					continue;
				}
				
				int cost = bfs(x, y, start[i].x, start[i].y);
				
				if(cost >= 0 && cost < count) {
					idxx = start[i].x;
					idxy = start[i].y;
					count = cost;
					idx = i;
				}
				else if(cost == count) {
					if(start[i].x < idxx || (start[i].x == idxx && start[i].y < idxy)) {
						idxx = start[i].x;
						idxy = start[i].y;
						count = cost;
						idx = i;
					}
				}
			}
			
			oil -= count;
			x = start[idx].x;
			y = start[idx].y;
			
			count = bfs(x, y, end[idx].x, end[idx].y);
			
			if(oil - count < 0 || count == -1) {
				return -1;
			}
			
			oil += count;
			x = end[idx].x;
			y = end[idx].y;
			
			flag[idx] = true;
		}
		return oil;
	}
	
	public static int bfs(int x, int y, int endx, int endy) {
		Queue<Node> queue = new LinkedList<>();
		boolean[][] visited = new boolean[n + 1][n + 1];
		
		queue.add(new Node(x, y, 0));
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			
			if(now.x == endx && now.y == endy) {
				return now.cost;
			}
			
			for(int i = 0; i < 4; i ++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(nx > 0 && nx <= n && ny > 0 && ny <= n) {
					if(!visited[nx][ny] && board[nx][ny] == 0) {
						queue.add(new Node(nx, ny, now.cost + 1));
						visited[nx][ny] = true;
					}
				}
			}
		}
		return -1;
	}
}

class Node {
	int x, y, cost;
	
	public Node(int x, int y, int cost) {
		this.x = x;
		this.y = y;
		this.cost = cost;
	}
}
