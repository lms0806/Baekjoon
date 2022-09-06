import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int n, m;
	static char[][] board;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			int starty = Integer.parseInt(st.nextToken()) - 1, startx = n - Integer.parseInt(st.nextToken());
			int endy = Integer.parseInt(st.nextToken()) - 1, endx = n - Integer.parseInt(st.nextToken());
			
			board = new char[n][n];
			for(int i = 0; i < n; i++) {
				board[i] = br.readLine().toCharArray();
			}
			
			sb.append(bfs(startx, starty, endx, endy)).append("\n");
		}
		System.out.println(sb);
	}
	
	public static String bfs(int x, int y, int endx, int endy) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[n][m];
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == endx && now[1] == endy) {
				return "YES";
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(!visited[nx][ny] && board[x][y] == board[nx][ny]) {
						queue.add(new int[] {nx, ny});
						visited[nx][ny] = true;
					}
				}
			}
		}
		return "NO";
	}
}
