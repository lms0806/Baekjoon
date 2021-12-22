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
	static boolean[][] visited;
	static Queue<int[]> queue = new LinkedList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			for(int j = 0; j < m; j++) {
				if(board[i][j] == 'W') {
					queue.add(new int[] {i, j});
				}
			}
		}
		
		bfs();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				sb.append(board[i][j] == '.' && !visited[i][j] ? "P" : board[i][j]);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static void bfs() {
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny] && board[nx][ny] != '#') {
					if(board[nx][ny] == '.') {
						queue.add(new int[] {nx, ny});
						visited[nx][ny] = true;
					}
					else {
						while(board[nx][ny] != '.') {
							if(board[nx][ny] == '#') {
								nx -= dx[i];
								ny -= dy[i];
								break;
							}
							nx += dx[i];
							ny += dy[i];
						}
						if(!visited[nx][ny]) {
							queue.add(new int[] {nx, ny});
							visited[nx][ny] = true;
						}
					}
				}
			}
		}
	}
}
