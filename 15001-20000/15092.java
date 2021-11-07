import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0, 1, -1, -1, 1};
	static int[] dy = {0, -1, 0, 1, -1, -1, 1, 1};
	static char[][] board;
	static boolean[][] visited;
	static int r, c;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		board = new char[r][c];
		visited = new boolean[r][c];
		
		for(int i = 0; i < r; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		int answer = 0;
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				if(!visited[i][j] && board[i][j] == '#') {
					bfs(i, j);
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
	
	public static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 8; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < r && ny >= 0 && ny < c) {
					if(board[nx][ny] == '#' && !visited[nx][ny]) {
						visited[nx][ny] = true;
						queue.add(new int[] {nx, ny});
					}
				}
			}
		}
	}
}
