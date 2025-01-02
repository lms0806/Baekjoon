import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int[][] a, b;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		a = new int[n][m];
		b = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				b[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		solve();
		
		System.out.print(check());
	}
	
	public static void solve() {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(a[i][j] != b[i][j]) {
					bfs(i, j, b[i][j]);
					return;
				}
			}
		}
	}
	
	public static void bfs(int x, int y, int num) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[n][m];
		
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i], ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny]) {
					if(a[now[0]][now[1]] == a[nx][ny]) {
						queue.add(new int[] {nx, ny});
						visited[nx][ny] = true;
					}
				}
			}
			
			a[now[0]][now[1]] = num;
		}
	}
	
	public static String check() {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(a[i][j] != b[i][j]) {
					return "NO";
				}
			}
		}
		return "YES";
	}
}
