import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int[][] board;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new int[n][m];
		
		st = new StringTokenizer(br.readLine());
		int startx = Integer.parseInt(st.nextToken()) - 1, starty = Integer.parseInt(st.nextToken()) - 1;
		int endx = Integer.parseInt(st.nextToken()) - 1, endy = Integer.parseInt(st.nextToken()) - 1;
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.print(dijkstra(startx, starty, endx, endy));
	}
	
	public static int dijkstra(int startx, int starty, int endx, int endy) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int[][][] dist = new int[n][m][3];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				Arrays.fill(dist[i][j], 30000);
			}
		}
		
		pq.add(new Node(startx, starty, 1, 0));
		dist[startx][starty][1] = 0;
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(dist[now.x][now.y][now.move] < now.cost) {
				continue;
			}
			
			if(now.x == endx && now.y == endy) {
				return now.cost;
			}
			
			int start = now.move % 3 == 2 ? 2 : 0;
			int end = now.move % 3 == 1 ? 2 : 4;
			
			int move = (now.move + 1) % 3;
			for(int i = start; i < end; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] != -1) {
					if(dist[nx][ny][move] > dist[now.x][now.y][now.move] + board[nx][ny]) {
						dist[nx][ny][move] = dist[now.x][now.y][now.move] + board[nx][ny];
						pq.add(new Node(nx, ny, move, dist[nx][ny][move]));
					}
				}
			}
		}
		
		return -1;
	}
}

class Node implements Comparable<Node>{
	int x, y, move, cost;
	
	public Node(int x, int y, int move, int cost) {
		this.x = x;
		this.y = y;
		this.move = move;
		this.cost = cost;
	}
	
	@Override
	public int compareTo(Node o) {
		return this.cost - o.cost;
	}
}
