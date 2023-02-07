import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int h, n, m;
	static int starth, startx, starty;
	static int endh, endx, endy;
	static char[][][] board;
	static int[] dh = {-1, 1, 0, 0, 0, 0};
	static int[] dx = {0, 0, 1, 0, -1, 0};
	static int[] dy = {0, 0, 0, 1, 0, -1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			h = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			board = new char[h][n][m];
			
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < n; j++) {
					board[i][j] = br.readLine().toCharArray();
					for(int k = 0; k < m; k++) {
						if(board[i][j][k] == 'S') {
							starth = i;
							startx = j;
							starty = k;
						}
						else if(board[i][j][k] == 'E') {
							endh = i;
							endx = j;
							endy = k;
						}
					}
				}
			}
			
			sb.append(dijkstra()).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int dijkstra() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int[][][] dist = new int[h][n][m];
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < n; j++) {
				Arrays.fill(dist[i][j], Integer.MAX_VALUE);
			}
		}
		
		dist[starth][startx][starty] = 0;
		pq.add(new Node(starth, startx, starty, 0));
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			for(int i = 0; i < 6; i++) {
				int nh = now.h + dh[i];
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(nh >= 0 && nh < h && nx >= 0 && nx < n && ny >= 0 && ny < m) {
					int cost = now.cost + (board[nh][nx][ny] == '#' ? 1 : 0);
					
					if(dist[nh][nx][ny] > cost) {
						dist[nh][nx][ny] = cost;
						pq.add(new Node(nh, nx, ny, cost));
					}
				}
			}
		}
		
		return dist[endh][endx][endy];
	}
}

class Node implements Comparable<Node>{
	int h, x, y, cost;
	
	public Node(int h, int x, int y, int cost) {
		this.h = h;
		this.x = x;
		this.y = y;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node o) {
		return this.cost - o.cost;
	}
}
