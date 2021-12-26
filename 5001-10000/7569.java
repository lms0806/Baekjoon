import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dh = {0, 0, 0, 0, 1, -1};
	static int[] dx = {1, -1, 0, 0, 0, 0};
	static int[] dy = {0, 0, -1, 1, 0, 0};
	static int n, m, h;
	static int[][][] arr;
	static Queue<int[]> queue = new LinkedList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		
		arr = new int[h][n][m];
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				for(int k = 0; k < m; k++) {
					arr[i][j][k] = Integer.parseInt(st.nextToken());
					if(arr[i][j][k] == 1) {
						queue.add(new int[] {i, j, k});
					}
				}
			}
		}
		
		bfs();
		
		System.out.print(print());
	}
	
	public static int print() {
		int max = 0;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < m; k++) {
					if(arr[i][j][k] == 0) {
						return -1;
					}
					max = Math.max(arr[i][j][k], max);
				}
			}
		}
		return max - 1;
	}
	
	public static void bfs() {
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 6; i++) {
				int nh = now[0] + dh[i];
				int nx = now[1] + dx[i];
				int ny = now[2] + dy[i];
				
				if(nh >= 0 && nh < h && nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(arr[nh][nx][ny] == 0) {
						queue.add(new int[] {nh, nx, ny});
						arr[nh][nx][ny] = arr[now[0]][now[1]][now[2]] + 1;
					}
				}
			}
		}
	}
}
