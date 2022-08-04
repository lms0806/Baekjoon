import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-1, 1, 0};
	static int[] dy = {0, 0, 1};
	static int n, m;
	static int[][] board;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new int[n][m];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int answer = bfs();
		System.out.print(answer == -1 ? "NIE" : answer);
	}
	
	public static int bfs() {
		PriorityQueue<Node> queue = new PriorityQueue<>();
		boolean[][] visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			if(board[i][0] == 0) {
				queue.add(new Node(i, 0, 0));
				visited[i][0] = true;
			}
		}
		
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			
			if(now.y == m - 1) {
				return now.cost;
			}
			
			for(int i = 0; i < 3; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny]) {
					if(board[nx][ny] == 0) {
						queue.add(new Node(nx, ny, now.cost + (i == 2 ? 0 : 1)));
						visited[nx][ny] = true;
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
