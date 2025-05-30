import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
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
		
		st = new StringTokenizer(br.readLine());
		Node s = new Node(Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1);
		
		st = new StringTokenizer(br.readLine());
		Node e = new Node(Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1);
		
		System.out.print(bfs(s, e));
	}
	
	public static int bfs(Node s, Node e) {
		Queue<Node> queue = new LinkedList<>();
		boolean[][][] visited = new boolean[n][m][4];
		
		queue.add(new Node(s.x, s.y, s.d, 0));
		visited[s.x][s.y][s.d] = true;
		
		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, 0};
		
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			
			if(now.x == e.x && now.y == e.y && now.d == e.d) {
				return now.cost;
			}
			
			int nx = now.x, ny = now.y;
			for(int i = 1; i <= 3; i++) {
				nx += dx[now.d];
				ny += dy[now.d];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(board[nx][ny] == 1) {
						break;
					}
					
					if(!visited[nx][ny][now.d]) {
						visited[nx][ny][now.d] = true;
						queue.add(new Node(nx, ny, now.d, now.cost + 1));
					}
				}
			}
			
			int nd = changeD(now.d, 'L');
			if(!visited[now.x][now.y][nd]) {
				queue.add(new Node(now.x, now.y, nd, now.cost + 1));
				visited[now.x][now.y][nd] = true;
			}
			
			nd = changeD(now.d, 'R');
			if(!visited[now.x][now.y][nd]) {
				queue.add(new Node(now.x, now.y, nd, now.cost + 1));
				visited[now.x][now.y][nd] = true;
			}
		}
		return 0;
	}
	
	public static int changeD(int d, char c) {
		if(c == 'L') {
			return d == 0 ? 3 : d == 1 ? 2 : d == 2 ? 0 : 1;
		}
		else {
			return d == 0 ? 2 : d == 1 ? 3 : d == 2 ? 1 : 0;
		}
	}
}

class Node {
	int x, y, d, cost;
	
	public Node(int x, int y, int d) {
		this.x = x;
		this.y = y;
		this.d = d;
	}
	
	public Node(int x, int y, int d, int cost) {
		this.x = x;
		this.y = y;
		this.d = d;
		this.cost = cost;
	}
}
