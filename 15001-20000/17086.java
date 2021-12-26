import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
	static int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};
	static int n, m;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(arr[i][j] == 0) {
					answer = Math.max(answer, bfs(i, j));
				}
			}
		}
		System.out.print(answer);
	}
	
	public static int bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[n][m];
		queue.add(new int[] {x, y, 0});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 8; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny]) {
					if(arr[nx][ny] == 1) {
						return now[2] + 1;
					}
					queue.add(new int[] {nx, ny, now[2] + 1});
					visited[nx][ny] = true;
				}
			}
		}
		return 0;
	}
}
