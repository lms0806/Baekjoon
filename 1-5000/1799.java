import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, b_count = 0, w_count = 0;
	static int[][] board;
	static boolean[][] visited;
	static int[] dx = {1, 1, -1, -1};
	static int[] dy = {1, -1, 1, -1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		board = new int[n + 1][n + 1];
		for(int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= n; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		visited = new boolean[n + 1][n + 1];
		black_search(1, 1, 0);
		
		visited = new boolean[n + 1][n + 1];
		white_search(1, 2, 0);
		
		System.out.print(b_count + w_count);
	}
	
	public static void black_search(int x, int y, int count) {
		b_count = Math.max(b_count, count);
		
		if(y > n) {
			x++;
			y = (x % 2 == 0) ? 2 : 1;
		}
		if(x > n) {
			return;
		}
		
		if(check(x, y)) {
			visited[x][y] = true;
			black_search(x, y + 2, count + 1);
			visited[x][y] = false;
		}
		
		black_search(x, y + 2, count);
	}
	
	public static void white_search(int x, int y, int count) {
		w_count = Math.max(w_count, count);
		
		if(y > n) {
			x++;
			y = (x % 2 == 0) ? 1 : 2;
		}
		if(x > n) {
			return;
		}
		
		if(check(x, y)) {
			visited[x][y] = true;
			white_search(x, y + 2, count + 1);
			visited[x][y] = false;
		}
		
		white_search(x, y + 2, count);
	}
	
	public static boolean check(int x, int y) {
		if(board[x][y] == 0) {
			return false;
		}
		
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			for(int j = 1; j <= n; j++) {
				if(nx > 0 && nx <= n && ny > 0 && ny <= n) {
					if(visited[nx][ny]) {
						return false;
					}
					
					nx += dx[i];
					ny += dy[i];
				}
			}
		}
		return true;
	}
}
