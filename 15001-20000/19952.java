import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int[][] board;
	static int n, m;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			board = new int[n][m];
			
			int o = Integer.parseInt(st.nextToken());
			int power = Integer.parseInt(st.nextToken());
			int sx = Integer.parseInt(st.nextToken()) - 1, sy = Integer.parseInt(st.nextToken()) - 1;
			int ex = Integer.parseInt(st.nextToken()) - 1, ey = Integer.parseInt(st.nextToken()) - 1;
			
			while(o --> 0) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
				
				board[a][b] = Integer.parseInt(st.nextToken());
			}
			sb.append(bfs(sx, sy, ex, ey, power)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String bfs(int sx, int sy, int ex, int ey, int power) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[n][m];
		queue.add(new int[] {sx, sy, power});
		visited[sx][sy] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[2] < 0) {
				continue;
			}
			
			if(now[0] == ex && now[1] == ey) {
				return "잘했어!!";
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(!visited[nx][ny]) {
						if(board[nx][ny] < board[now[0]][now[1]]) {
							queue.add(new int[] {nx, ny, now[2] - 1});
							visited[nx][ny] = true;
						}
						if(board[nx][ny] - board[now[0]][now[1]] <= now[2]) {
							queue.add(new int[] {nx, ny, now[2] - 1});
							visited[nx][ny] = true;
						}
					}
				}
			}
		}
		return "인성 문제있어??";
	}
}
