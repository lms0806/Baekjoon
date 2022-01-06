import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int n, m, xd = 0, yd = 0;
	static char[][] board;
	static Queue<int[]> queue, water;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		
		queue = new LinkedList<>();
		water = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			for(int j = 0; j < m; j++) {
				if(board[i][j] == 'S') {
					queue.add(new int[] {i, j, 0});
				}
				else if(board[i][j] == '*') {
					water.add(new int[] {i, j, 0});
				}
				else if(board[i][j] == 'D') {
					xd = i;
					yd = j;
				}
			}
		}
		
		int answer = bfs();
		
		System.out.print(answer == -1 ? "KAKTUS" : answer);
	}
	
	public static int bfs() {
		while(!queue.isEmpty()) {
			int size = water.size();
			for(int i = 0; i < size; i++) {
				int[] now = water.poll();
				
				for(int d = 0; d < 4; d++) {
					int nx = now[0] + dx[d];
					int ny = now[1] + dy[d];
					
					if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
						if(board[nx][ny] == '.' || board[nx][ny] == 'S') {
							board[nx][ny] = '*';
							water.add(new int[] {nx, ny, now[2] + 1});
						}
					}
				}
			}
			
			size = queue.size();
			for(int i = 0; i < size; i++) {
				int[] now = queue.poll();
				
				for(int d = 0; d < 4; d++) {
					int nx = now[0] + dx[d];
					int ny = now[1] + dy[d];
					
					if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
						if(board[nx][ny] == 'D') {
							return now[2] + 1;
						}
						if(board[nx][ny] == '.') {
							board[nx][ny] = 'S';
							queue.add(new int[] {nx, ny, now[2] + 1});
						}
					}
				}
			}
		}
		return -1;
	}
}
