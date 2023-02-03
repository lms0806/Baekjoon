import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static boolean[][] visited;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[] dr = {-1, 1, 1, -1};
	static int[] dc = {1, 1, -1, -1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n][m];
		
		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()) - 1, y = Integer.parseInt(st.nextToken()) - 1;
			int num = Integer.parseInt(st.nextToken());
			
			visited[x][y] = true;
			
			int nx = x;
			int ny = y - num;
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < num; j++) {
					nx += dr[i];
					ny += dc[i];
					
					if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
						visited[nx][ny] = true;
					}
				}
			}
		}
		
		System.out.print(bfs());
	}
	
	public static String bfs() {
		Queue<int[]> pq = new LinkedList<>();
		
		pq.add(new int[] {0, 0, 0});
		
		while(!pq.isEmpty()) {
			int[] now = pq.poll();
			int x = now[0], y = now[1];
			
			if(x == n - 1 && y == m - 1) {
				return "YES\n" + now[2];
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny]) {
					pq.add(new int[] {nx, ny, now[2] + 1});
					visited[nx][ny] = true;
				}
			}
		}
		return "NO";
	}
}
