import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static char[][] board;
	static boolean[][] wall;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		wall = new boolean[n][m];
		
		int startx = 0, starty = 0;
		int endx = 0, endy = 0;
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			
			for(int j = 0; j < m; j++) {
				if(board[i][j] == 'S') {
					startx = i;
					starty = j;
				}
				else if(board[i][j] == 'E') {
					endx = i;
					endy = j;
				}
			}	
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				for(int k = 0; k < 4; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					
					if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == '#') {
						wall[i][j] = true;
						break;
					}
				}
			}
		}
		
		System.out.print(Dijkstra(startx, starty, endx, endy));
	}
	
	public static int Dijkstra(int startx, int starty, int endx, int endy) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int[][] dist = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			Arrays.fill(dist[i], Integer.MAX_VALUE);
		}
		
		pq.add(new Node(startx, starty, 0));
		dist[startx][starty] = 0;
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			int x = now.x, y = now.y;
			
			if(dist[x][y] < now.cost) {
				continue;
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] != '#') {
					int cost = wall[x][y] && wall[nx][ny] ? 0 : 1;
					if(dist[nx][ny] > dist[x][y] + cost) {
						dist[nx][ny] = dist[x][y] + cost;
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
