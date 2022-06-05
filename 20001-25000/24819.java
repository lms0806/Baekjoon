import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static char[] which = {'U', 'R', 'D', 'L'};
	static char[][] board;
	static int t, n, m;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		t = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		
		int x = 0, y = 0;
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			for(int j = 0; j < m; j++) {
				if(board[i][j] == 'S') {
					x = i;
					y = j;
				}
			}
		}
		
		System.out.print(bfs(x, y));
	}
	
	public static String bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[n][m];
		queue.add(new int[] {x, y, 0});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[2] > t) {
				continue;
			}
			
			if(now[0] == 0 || now[1] == 0 || now[0] == n - 1 || now[1] == m - 1) {
				return now[2] + "";
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(!visited[nx][ny] && board[nx][ny] != '1') {
						if(board[nx][ny] == '0' || board[nx][ny] == which[i]) {
							queue.add(new int[] {nx, ny, now[2] + 1});
							visited[nx][ny] = true;
						}
					}
				}
			}
		}
		
		return "NOT POSSIBLE";
	}
}
