import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static char[][] board;
	static Node[][] road;
	static int n, m;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		road = new Node[n][m];
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			for(int j = 0; j < m; j++) {
				if(board[i][j] == '.') {
					board[i][j] = '@';
				}
			}
		}
		
		Node[] hole = new Node[2];
		int idx = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(board[i][j] == '@') {
					if(i == 0 || i == n - 1 || j == 0 || j == m - 1) {
						hole[idx] = new Node(i, j);
						idx++;
					}
				}
			}
		}
		
		bfs(hole[0].x, hole[0].y);
		
		Node now = new Node(hole[1].x, hole[1].y);
		
		while(now.x != hole[0].x || now.y != hole[0].y) {
			board[now.x][now.y] = '.';
			now = road[now.x][now.y];
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(board[i]).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[n][m];
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		board[x][y] = '.';
		road[x][y] = new Node(x, y);
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(!visited[nx][ny] && board[nx][ny] == '@') {
						queue.add(new int[] {nx, ny});
						visited[nx][ny] = true;
						road[nx][ny] = new Node(now[0], now[1]);
					}
				}
			}
		}
	}
}

class Node{
	int x, y;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
