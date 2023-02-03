import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static char[][] board;
	static boolean[][] visited;
	static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
	static int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		visited = new boolean[n][m];
		
		int x = 0, y = 0;
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			
			for(int j = 0; j < m; j++) {
				if(board[i][j] == 'K') {
					x = i;
					y = j;
				}
			}
		}
		
		System.out.print(bfs(x, y));
	}
	
	public static int bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y, 0});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(board[now[0]][now[1]] == 'X') {
				return now[2];
			}
			
			for(int i = 0; i < 8; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(!visited[nx][ny] && board[nx][ny] != '#') {
						queue.add(new int[] {nx, ny, now[2] + 1});
						visited[nx][ny] = true;
					}
				}
			}
		}
		
		return -1;
	}
}
