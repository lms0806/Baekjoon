import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-2, -2, 0, 0, 2, 2};
	static int[] dy = {-1, 1, -2, 2, -1, 1};
	static int n, m;
	static int[][] arr;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n + 1][n + 1];
		visited = new boolean[n + 1][n + 1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r1 = Integer.parseInt(st.nextToken()), c1 = Integer.parseInt(st.nextToken());
		int r2 = Integer.parseInt(st.nextToken()), c2 = Integer.parseInt(st.nextToken());
	
		bfs(r1, c1);
		
		System.out.print(arr[r2][c2] == 0 ? -1 : arr[r2][c2]);
	}
	
	public static int bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 6; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
					if(!visited[nx][ny]) {
						visited[nx][ny] = true;
						queue.add(new int[] {nx, ny});
						arr[nx][ny] = arr[now[0]][now[1]] + 1;
					}
				}
			}
		}
		return -1;
	}
}
