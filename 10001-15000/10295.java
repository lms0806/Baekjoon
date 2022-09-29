import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n, m, INF = 100000000;
	static char[][] board;
	static long[][] dist;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			board = new char[n][m];
			
			int endx = 0, endy = 0, max = 0;
			for(int i = 0; i < n; i++) {
				board[i] = br.readLine().toCharArray();
				for(int j = 0; j < n; j++) {
					if(board[i][j] == '#') {
						continue;
					}
					
					if(max < board[i][j] - '0') {
						endx = i;
						endy = j;
						max = board[i][j] - '0';
					}
				}
			}
			
			st = new StringTokenizer(br.readLine());
			int startx = Integer.parseInt(st.nextToken()), starty = Integer.parseInt(st.nextToken());
			
			int answer = dijkstra(startx, starty, endx, endy);
			System.out.println(answer == INF ? "NO" : answer);
		}
	}
	
	public static int dijkstra(int startx, int starty, int endx, int endy) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int[][] dist = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			Arrays.fill(dist[i], INF);
		}
		
		pq.add(new Node(startx, starty, 0));
		dist[startx][starty] = 0;
		
		int[] dx = {1, 0, -1, 0, 1, 1, -1, -1};
		int[] dy = {0, 1, 0, -1, 1, -1, 1, -1};
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
					if(board[nx][ny] == '#') {
						continue;
					}
					
					if(board[nx][ny] == board[x][y] && dist[nx][ny] > dist[x][y] + 1) {
						dist[nx][ny] = dist[x][y] + 1;
						pq.add(new Node(nx, ny, dist[nx][ny]));
					}
					if(board[nx][ny] > board[x][y] && dist[nx][ny] > dist[x][y] + Math.pow(board[nx][ny] - board[x][y] + 1, 2)) {
						dist[nx][ny] = (int) (dist[x][y] + Math.pow(board[nx][ny] - board[x][y] + 1, 2));
						pq.add(new Node(nx, ny, dist[nx][ny]));
					}
					
					if(board[nx][ny] < board[x][y] && dist[nx][ny] > dist[x][y] + Math.pow(board[x][y] - board[nx][ny] + 1, 2)) {
						dist[nx][ny] = (int) (dist[x][y] + Math.pow(board[x][y] - board[nx][ny] + 1, 2));
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
		return (int)(this.cost - o.cost);
	}
}
