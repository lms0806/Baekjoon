import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int n, m;
	static char[][] board;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		int sx = 0, sy = 0;
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			for(int j = 0; j < board[i].length; j++) {
				if(board[i][j] == '0') {
					sx = i;
					sy = j;
				}
			}
		}
		
		System.out.print(bfs(sx, sy));
	}
	
	public static int bfs(int sx, int sy) {
		Queue<Node> queue = new LinkedList<>();
		boolean[][][] visited = new boolean[n][m][64];
		queue.add(new Node(sx, sy, 0, 0));
		visited[sx][sy][0] = true;
		
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			
			if(board[now.x][now.y] == '1') {
				return now.length;
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] != '#' && !visited[nx][ny][now.key]) {
					if(board[nx][ny] == '.' || board[nx][ny] == '0' || board[nx][ny] == '1') {
						visited[nx][ny][now.key] = true;
						queue.add(new Node(nx, ny, now.length + 1, now.key));
					}
					else if('a' <= board[nx][ny] && board[nx][ny] <= 'f'){
						int newkey = 1 << (board[nx][ny] - 'a');
						newkey |= now.key;
						if(!visited[nx][ny][newkey]) {
							visited[nx][ny][newkey] = true;
							visited[nx][ny][now.key] = true;
							queue.add(new Node(nx, ny, now.length + 1, newkey));
						}
					}
					else if('A' <= board[nx][ny] && board[nx][ny] <= 'F') {
						int door = 1 << (board[nx][ny] - 'A');
						if((now.key & door) > 0) {
							visited[nx][ny][now.key] = true;
							queue.add(new Node(nx, ny, now.length + 1, now.key));
						}
					}
				}
			}
		}
		return -1;
	}
}

class Node{
	int x, y, length, key;
	
	public Node(int x, int y, int length, int key) {
		this.x = x;
		this.y = y;
		this.length = length;
		this.key = key;
	}
}
