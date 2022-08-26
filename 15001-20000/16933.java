import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int n, m, k;
	static char[][] board;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		System.out.print(bfs());
	}
	
	public static int bfs() {
		Queue<Node> queue = new LinkedList<>();
		boolean[][][] visited = new boolean[n][m][k + 1];
		queue.add(new Node(0, 0, 0, 1, 'M')); //x, y, 벽, count, 낮과 밤
		visited[0][0][0] = true;
		
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			
			if(now.x == n - 1 && now.y == m - 1) {
				return now.count;
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(board[nx][ny] == '0' && !visited[nx][ny][now.wall]) {
						queue.add(new Node(nx, ny, now.wall, now.count + 1, now.day == 'N' ? 'M' : 'N'));
						visited[nx][ny][now.wall] = true;
					}
					else if(board[nx][ny] == '1' && now.wall < k && !visited[nx][ny][now.wall + 1]) {
						if(now.day == 'M') {
							queue.add(new Node(nx, ny, now.wall + 1, now.count + 1, 'N'));
							visited[nx][ny][now.wall + 1] = true;
						}
						else {
							queue.add(new Node(now.x, now.y, now.wall, now.count + 1, 'M'));
						}
					}
				}
			}
		}
		return -1;
	}
}

class Node{
	int x, y, wall, count;
	char day;
	
	public Node(int x, int y, int wall, int count, char day) {
		this.x = x;
		this.y = y;
		this.wall = wall;
		this.count = count;
		this.day = day;
	}
}
