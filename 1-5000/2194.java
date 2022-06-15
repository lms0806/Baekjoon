import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int n, m, a, b;
	static int[][] board;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		board = new int[n][m];
		
		while(k --> 0) {
			st = new StringTokenizer(br.readLine());
			board[Integer.parseInt(st.nextToken()) - 1][Integer.parseInt(st.nextToken()) - 1] = -1;
		}
		
		st = new StringTokenizer(br.readLine());
		int sx = Integer.parseInt(st.nextToken()) - 1, sy = Integer.parseInt(st.nextToken()) - 1;

		st = new StringTokenizer(br.readLine());
		int ex = Integer.parseInt(st.nextToken()) - 1, ey = Integer.parseInt(st.nextToken()) - 1;
		
		System.out.print(bfs(sx, sy, ex, ey));
	}
	
	public static int bfs(int sx, int sy, int ex, int ey) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[n][m];
		queue.add(new int[] {sx, sy, 0});
		visited[sx][sy] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == ex && now[1] == ey) {
				return now[2];
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(check(nx, ny) && !visited[nx][ny]) {
					queue.add(new int[] {nx, ny, now[2] + 1});
					visited[nx][ny] = true;
				}
			}
		}
		return -1;
	}
	
	public static boolean check(int x, int y) {
		if(x >= 0 && x + a - 1 < n&& y >= 0 && y + b - 1 < m) {
			for(int i = x; i < x + a; i++) {
				for(int j = y; j < y + b; j++) {
					if(board[i][j] == -1) {
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}
}
