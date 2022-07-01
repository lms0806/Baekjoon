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
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		road = new Node[n][m];
		board = new char[n][m];
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		bfs();
		
		print(n - 1, m - 1);
		System.out.print(sb);
	}
	
	public static void bfs() {
		Queue<Node> queue = new LinkedList<>();
		queue.add(new Node(0, 0));
		road[0][0] = new Node(0, 0);
		
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			
			if(now == new Node(n - 1, m - 1)) {
				return;
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(road[nx][ny] == null && board[nx][ny] == '.') {
						queue.add(new Node(nx, ny));
						road[nx][ny] = new Node(now.x, now.y);
					}
				}
			}
		}
	}
	
	public static void print(int x, int y) {
		if(x != 0 || y != 0) {
			print(road[x][y].x, road[x][y].y);
		}
		sb.append(x + 1).append(" ").append(y + 1).append("\n");
	}
}

class Node{
	int x, y;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
