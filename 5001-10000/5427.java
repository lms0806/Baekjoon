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
	static Queue<int[]> jh, fire;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			
			board = new char[n][m];
			
			jh = new LinkedList<>();
			fire = new LinkedList<>();
			
			for(int i = 0; i < n; i++) {
				board[i] = br.readLine().toCharArray();
				for(int j = 0; j < m; j++) {
					if(board[i][j] == '@') {
						jh.add(new int[] {i, j, 0});
					}
					else if(board[i][j] == '*') {
						fire.add(new int[] {i, j, 0});
					}
				}
			}
			
			int answer = bfs();
			
			sb.append(answer == -1 ? "IMPOSSIBLE" : answer).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int bfs() {
		while(!jh.isEmpty()) {
			int size = fire.size();
			for(int i = 0; i < size; i++) {
				int[] now = fire.poll();
				
				for(int d = 0; d < 4; d++) {
					int nx = now[0] + dx[d];
					int ny = now[1] + dy[d];
					
					if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
						if(board[nx][ny] == '.' || board[nx][ny] == '@') {
							board[nx][ny] = '*';
							fire.add(new int[] {nx, ny, now[2] + 1});
						}
					}
				}
			}
			
			size = jh.size();
			for(int i = 0; i < size; i++) {
				int[] now = jh.poll();
				
				for(int d = 0; d < 4; d++) {
					int nx = now[0] + dx[d];
					int ny = now[1] + dy[d];
					
					if(nx < 0 || nx >= n || ny < 0 || ny >= m) {
						return now[2] + 1;
					}
					
					if(board[nx][ny] == '.') {
						board[nx][ny] = '@';
						jh.add(new int[] {nx, ny, now[2] + 1});
					}
				}
			}
		}
		return -1;
	}
}
