import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int[][] dist;
	static char[][] board;
	static int[] dx = {1, 1, 1, 0, 0, -1, -1, -1};
	static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1}; 
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		dist = new int[n][m];
		board = new char[n][m];
		
		int sx = 0, sy = 0;
		int ex = 0, ey = 0;
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			
			for(int j = 0; j < m; j++) {
				if(board[i][j] == 'K') {
					sx = i;
					sy = j;
				}
				if(board[i][j] == '*') {
					ex = i;
					ey = j;
				}
			}
		}
		
		bfs(sx, sy);
		
		System.out.print(dist[ex][ey] == Integer.MAX_VALUE ? -1 : dist[ex][ey]);
	}
	
	public static void bfs(int sx, int sy) {
		Queue<Node> queue = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			Arrays.fill(dist[i], Integer.MAX_VALUE);
		}
		
		dist[sx][sy] = 0;
		queue.add(new Node(sx, sy, 0));
		
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			
			for(int i = 0; i < 8; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] != '#') {
					int cost = dy[i] == 1 ? 0 : 1;
					
					if(dist[nx][ny] > dist[now.x][now.y] + cost) {
						dist[nx][ny] = dist[now.x][now.y] + cost;
						queue.add(new Node(nx, ny, dist[nx][ny]));
					}
				}
			}
		}
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
