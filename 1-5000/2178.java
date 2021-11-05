import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int n, m, count = 0;
	static boolean[][] visited;
	static int[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < m; j++) {
				arr[i][j] = s.charAt(j) - '0';
			}
		}
		
		bfs(0, 0);
		
		System.out.print(arr[n - 1][m - 1]);
	}
	
	public static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nextx = now[0] + dx[i];
				int nexty = now[1] + dy[i];
				
				if(nextx >= 0 && nextx < n && nexty >= 0 && nexty < m) {
					if(arr[nextx][nexty] != 0 && !visited[nextx][nexty]) {
						queue.add(new int[] {nextx, nexty});
						visited[nextx][nexty] = true;
						arr[nextx][nexty] = arr[now[0]][now[1]] + 1;
					}
				}
			}
		}
	}
}
