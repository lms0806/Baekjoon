import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int[] ddx = {1, 2, 2, 1, -1, -2, -2, -1};
	static int[] ddy = {2, 1, -1, -2, -2, -1, 1, 2};
	static int n, m, k;
	static int[][] arr;
	static boolean[][][] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		k = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new boolean[n][m][k + 1];
	
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.print(bfs());
	}
	
	public static int bfs() {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {0, 0, 0, 0});
		visited[0][0][0] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == n - 1 && now[1] == m - 1) {
				return now[2];
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(check(nx, ny)) {
					if(!visited[nx][ny][now[3]]) {
						queue.add(new int[] {nx, ny, now[2] + 1, now[3]});
						visited[nx][ny][now[3]] = true;
					}
				}
			}
			
			if(now[3] < k) {
				for(int i = 0; i < 8; i++) {
					int nx = now[0] + ddx[i];
					int ny = now[1] + ddy[i];
					
					if(check(nx, ny)) {
						if(!visited[nx][ny][now[3] + 1]) {
							queue.add(new int[] {nx, ny, now[2] + 1, now[3] + 1});
							visited[nx][ny][now[3] + 1] = true;
						}
					}
				}
			}
		}
		
		return -1;
	}
	
	public static boolean check(int nx, int ny) {
		if(nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 0) {
			return true;
		}
		return false;
	}
}
