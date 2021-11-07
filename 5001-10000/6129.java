import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int n;
	static char[][] board;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine().trim());
		
		board = new char[n][n];
		
		int x = 0, y = 0, xx = 0, yy = 0;
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < n; j++) {
				board[i][j] = s.charAt(j);
				if(board[i][j] == 'A') {
					x = i;
					y = j;
				}
				if(board[i][j] == 'B') {
					xx = i;
					yy = j;
					board[i][j] = '.';
				}
			}
		}
		
		System.out.print(bfs(x, y, xx, yy));
	}
	
	public static int bfs(int x, int y, int xx, int yy) {
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[3] - b[3]);
		pq.add(new int[] {x, y, -1, 0});
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			Arrays.fill(arr[i], Integer.MAX_VALUE);
		}
		
		while(!pq.isEmpty()) {
			int[] now = pq.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				int next = now[3] + (now[2] == -1 || now[2] == i ? 0 : 1);
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == '.' && arr[nx][ny] >= next) {
					arr[nx][ny] = next;
					pq.add(new int[] {nx, ny, i, next});
				}
			}
		}
		return arr[xx][yy];
	}
}
