import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m, k = 0;
	static boolean[][][] visited;
	static char[][] board;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		visited = new boolean[n][m][33];
		
		int sx = 0, sy = 0;
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			for(int j = 0; j < m; j++) {
				if(board[i][j] == 'S') {
					sx = i;
					sy = j;
				}
				else if(board[i][j] == 'X') {
					board[i][j] = (char)('0' + k++);
				}
			}
		}
		
		k = (1 << k) - 1;
		
		System.out.print(bfs(sx, sy));
	}
	
	public static int bfs(int sx, int sy) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(new Node(sx, sy, 0, 0));
		visited[sx][sy][0] = true;
		
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			
			if(board[now.x][now.y] == 'E' && now.thing == k) {
				return now.cost;
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(nx < 0 || nx >= n || ny < 0 || ny >= m || board[nx][ny] == '#') {
					continue;
				}
				
				if(board[nx][ny] >= '0' && board[nx][ny] < '5') {
					int nt = now.thing | (1 << (board[nx][ny] - '0'));
					
					if(!visited[nx][ny][nt]){
						visited[nx][ny][nt] = true;
						queue.add(new Node(nx, ny, now.cost + 1, nt));
					}
				}
				else if(!visited[nx][ny][now.thing]){
					visited[nx][ny][now.thing] = true;
					queue.add(new Node(nx, ny, now.cost + 1, now.thing));
				}
			}
			
		}
		return -1;
	}
}

class Node {
	int x, y, cost, thing;
	
	public Node(int x, int y, int cost, int thing) {
		this.x = x;
		this.y = y;
		this.cost = cost;
		this.thing = thing;
	}
}
