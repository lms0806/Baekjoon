import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int[][] board, visited;
	static int n, m;
	static Queue<int[]> queue;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new int[n][m];
		visited = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		queue = new LinkedList<>();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(board[i][j] == 1) {
					queue.add(new int[] {i, j, 1, 0});
				}
				else if(board[i][j] == 2) {
					queue.add(new int[] {i, j, 2, 0});
				}
			}
		}
		
		bfs();
		
		int[] arr = new int[3];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(board[i][j] > 0) {
					arr[board[i][j] - 1]++;
				}
			}
		}
		
		System.out.print(arr[0] + " " + arr[1] + " " + arr[2]);
	}
	
	public static void bfs() {
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(board[now[0]][now[1]] != 3) {
				for(int i = 0; i < 4; i++) {
					int nx = now[0] + dx[i];
					int ny = now[1] + dy[i];
					
					if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
						if(board[nx][ny] == 0) {
							board[nx][ny] = now[2];
							visited[nx][ny] = now[3] + 1;
							queue.add(new int[] {nx, ny, now[2], now[3] + 1});
						}
						else if(board[nx][ny] != -1 && board[nx][ny] != now[2]) {
							if(visited[nx][ny] == now[3] + 1) {
								board[nx][ny] = 3;
							}
						}
					}
				}
			}
		}
	}
}
