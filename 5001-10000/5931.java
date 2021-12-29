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
	static char[][] board, board2;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		int count = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(board[i][j] == 'X') {
					bfs(i, j, count + "");
					count++;
				}
			}
		}
		
		int answer = n * m;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(board[i][j] == '1') {
					board2 = new char[n][m];
					for(int k = 0; k < n; k++) {
						board2[k] = board[k].clone();
					}
					int c = bfs2(i, j);
					if(c > -1) {
						answer = Math.min(answer, c);
					}
				}
			}
		}
		System.out.println(answer);
	}
	
	public static void bfs(int x, int y, String c) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		board[x][y] = c.charAt(0);
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(board[nx][ny] == 'X') {
						queue.add(new int[] {nx, ny});
						board[nx][ny] = c.charAt(0);
					}
				}
			}
		}
	}
	
	public static int bfs2(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		board2[x][y] = '0';
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(board[nx][ny] == '2') {
						return board2[now[0]][now[1]] - '0';
					}
					if(board2[nx][ny] == '.') {
						queue.add(new int[] {nx, ny});
						board2[nx][ny] = (char)(board2[now[0]][now[1]] + 1);
					}
				}
			}
		}
		return -1;
	}
}
