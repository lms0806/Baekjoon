import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n, m, d, INF = 100000000;
	static char[][] board;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());
			
			board = new char[n][m];
			
			int startx = 0, starty = 0;
			for(int i = 0; i < n; i++) {
				board[i] = br.readLine().toCharArray();
				for(int j = 0; j < m; j++) {
					if(board[i][j] == 'S') {
						startx = i;
						starty = j;
					}
				}
			}
			
			sb.append(dijkstra(startx, starty)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int dijkstra(int startx, int starty) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int[][] dist = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			Arrays.fill(dist[i], INF);
		}
		
		pq.add(new Node(startx, starty, 0));
		dist[startx][starty] = 0;
		
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			int x = now.x, y = now.y;
			
			if(x == 0 || x == n - 1 || y == 0 || y == m - 1) {
				return now.cost + 1;
			}
			
			if(dist[x][y] < now.cost) {
				continue;
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(board[nx][ny] == '@' && dist[nx][ny] > dist[x][y] + d + 1) {
						dist[nx][ny] = dist[x][y] + d + 1;
						pq.add(new Node(nx, ny, dist[nx][ny]));
					}
					
					if(board[nx][ny] == '.' && dist[nx][ny] > dist[x][y] + 1) {
						dist[nx][ny] = dist[x][y] + 1;
						pq.add(new Node(nx, ny, dist[nx][ny]));
					}
				}
			}
		}
		return -1;
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
