import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[][] board;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		board = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.print(dijkstra());
	}
	
	public static int dijkstra() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int[][] dist = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			Arrays.fill(dist[i], Integer.MAX_VALUE);
		}
		
		pq.add(new Node(0, 0, 0));
		dist[0][0] = 0;
		
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(dist[now.x][now.y] < now.cost) {
				continue;
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
					int cost = Math.max(now.cost, Math.abs(board[nx][ny] - board[now.x][now.y]));
					
					if(dist[nx][ny] > cost) {
						dist[nx][ny] = cost;
						pq.add(new Node(nx, ny, cost));
					}
				}
			}
		}
		
		return dist[n - 1][n - 1];
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
