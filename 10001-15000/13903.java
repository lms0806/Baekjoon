import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx;
	static int[] dy;
	static int[][] arr, num;
	static int r, c;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		arr = new int[r][c];
		num = new int[r][c];
		
		for(int i = 0; i < r; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < c; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				num[i][j] = -1;
			}
		}
		
		int n = Integer.parseInt(br.readLine());
		
		dx = new int[n];
		dy = new int[n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			dx[i] = Integer.parseInt(st.nextToken());
			dy[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.print(bfs());
	}
	
	public static int bfs() {
		Queue<int[]> queue = new LinkedList<>();
		
		for(int i = 0; i < c; i++) {
			if(arr[0][i] == 1) {
				queue.add(new int[] {0, i});
				num[0][i] = 0;
			}
		}
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			int x = now[0], y = now[1];
			
			if(x == r - 1) {
				return num[x][y];
			}
			
			for(int i = 0; i < dx.length; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < r && ny >= 0 && ny < c) {
					if(num[nx][ny] == -1 && arr[nx][ny] == 1) {
						num[nx][ny] = num[x][y] + 1;
						queue.add(new int[] {nx, ny});
					}
				}
			}
		}
		
		return -1;
	}
}
