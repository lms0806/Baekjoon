import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static char[][][] board;
	static boolean[][][] visited;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[2][n][m];
		visited = new boolean[2][n][m];
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = br.readLine().toCharArray();
			}
		}
		
		System.out.print(solve());
	}
	
	public static String solve() {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(!visited[1][i][j]) {
					bfs(1, i, j);
					
					if(!bfs(0, i, j)) {
						return "NO";
					}
				}
			}
		}
		return "YES";
	}
	
	public static boolean bfs(int idx, int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		visited[idx][x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(!visited[idx][nx][ny] && board[idx][x][y] == board[idx][nx][ny]) {
						if(!visited[1][nx][ny]) {
							return false;
						}
						
						visited[idx][nx][ny] = true;
						queue.add(new int[] {nx, ny});
					}
				}
			}
		}
		return true;
	}
}
