import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static int n, m, k;
	static char[][] board;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		st = new StringTokenizer(br.readLine());
		int startx = Integer.parseInt(st.nextToken()) - 1, starty = Integer.parseInt(st.nextToken()) - 1;
		int endx = Integer.parseInt(st.nextToken()) - 1, endy = Integer.parseInt(st.nextToken()) - 1;
		
		System.out.print(bfs(startx, starty, endx, endy));
	}
	
	public static int bfs(int startx, int starty, int endx, int endy) {
		Deque<int[]> dq = new ArrayDeque<>();
		int[][] dist = new int[n][m];
		dq.add(new int[] {startx, starty});
		dist[startx][starty] = 0;
		
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		while(!dq.isEmpty()) {
			int[] now = dq.poll();
			
			if(now[0] == endx && now[1] == endy) {
				return dist[endx][endy] == 0 ? -1 : dist[endx][endy];
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0], ny = now[1];
				
				for(int j = 0; j < k; j++) {
					nx += dx[i];
					ny += dy[i];
					
					if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
						if(board[nx][ny] == '#') {
							break;
						}
						if(dist[nx][ny] == 0) {
							dist[nx][ny] = dist[now[0]][now[1]] + 1;
							dq.add(new int[] {nx, ny});
						}
						else if(dist[nx][ny] <= dist[now[0]][now[1]]){
							break;
						}
					}
				}
			}
		}
		
		return dist[endx][endy] == 0 ? -1 : dist[endx][endy];
	}
}
