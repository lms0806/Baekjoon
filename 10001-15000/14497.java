import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int n, m;
	static char[][] board, boards;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()) - 1, y = Integer.parseInt(st.nextToken()) - 1;
		int x1 = Integer.parseInt(st.nextToken()) - 1, y1 = Integer.parseInt(st.nextToken()) - 1;
		
		board = new char[n][m];
		boards = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < m; j++) {
				board[i][j] = s.charAt(j);
			}
		}
		
		int answer = 0;
		while(true) {
			answer++;
			visited = new boolean[n][m];
			
			for(int i = 0; i < n; i++) {
				boards[i] = board[i].clone();
			}
			
			if(bfs(x, y, x1, y1)) {
				break;
			}
			
			for(int i = 0; i < n; i++) {
				board[i] = boards[i].clone();
			}
		}
		
		System.out.print(answer);
	}
	
	public static boolean bfs(int x, int y, int x1, int y1) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny]) {
					visited[nx][ny] = true;
					if(boards[nx][ny] == '#') {
						return true;
					}
					if(boards[nx][ny] == '1') {
						boards[nx][ny] = '0';
						continue;
					}
					queue.add(new int[] {nx, ny});
				}
			}
		}
		return false;
	}
}
