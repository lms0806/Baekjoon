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
	static boolean[][] visited;
	static int r, c;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			c = Integer.parseInt(st.nextToken());
			r = Integer.parseInt(st.nextToken());
			
			if(r == 0 && c == 0) {
				break;
			}
			
			visited = new boolean[r][c];
			board = new char[r][c];
			
			int x = 0, y = 0;
			for(int i = 0; i < r; i++) {
				board[i] = br.readLine().toCharArray();
				if(x == 0 && y == 0) {
					for(int j = 0; j < board[i].length; j++) {
						if(board[i][j] == 'S') {
							x = i;
							y = j;
							break;
						}
					}
				}
			}
			bfs(x, y);
			
			for(int i = 0; i < r; i++) {
				sb.append(board[i]).append("\n");
			}
		}
		System.out.print(sb);
	}
	
	public static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < r && ny >= 0 && ny < c) {
					if(board[nx][ny] == 'T' && !visited[nx][ny]) {
						board[nx][ny] = 'S';
						visited[nx][ny] = true;
						queue.add(new int[] {nx, ny});
					}
				}
			}
		}
	}
}
