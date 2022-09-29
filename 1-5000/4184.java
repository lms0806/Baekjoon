import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n, m, INF = 1000000;
	static char[][] board;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int startx = Integer.parseInt(st.nextToken()), starty = Integer.parseInt(st.nextToken());
			int endx = Integer.parseInt(st.nextToken()), endy = Integer.parseInt(st.nextToken());
			
			sb.append(dijkstra(startx - 1, starty - 1, endx - 1, endy - 1)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int dijkstra(int startx, int starty, int endx, int endy) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int[][] dist = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			Arrays.fill(dist[i], INF);
		}
		
		pq.add(new Node(startx, starty, 0));
		dist[startx][starty] = 0;
		
		int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
		int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			int x = now.x, y = now.y;
			
			if(dist[x][y] < now.cost) {
				continue;
			}
			
			for(int i = 0; i < 8; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(board[x][y] - '0' == i && dist[nx][ny] > dist[x][y]) {
						dist[nx][ny] = dist[x][y];
						pq.add(new Node(nx, ny, dist[nx][ny]));
					}
					
					if(dist[nx][ny] > dist[x][y] + 1) {
						dist[nx][ny] = dist[x][y] + 1;
						pq.add(new Node(nx, ny, dist[nx][ny]));
					}
				}
			}
		}
		return dist[endx][endy];
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
