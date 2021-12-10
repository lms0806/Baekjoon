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
	static char[][] board;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int x1 = Integer.parseInt(st.nextToken()), y1 = Integer.parseInt(st.nextToken());
		
		System.out.print(bfs(x - 1, y - 1, x1 - 1, y1 - 1));
	}
	
	public static String bfs(int x, int y, int x1, int y1) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(nx == x1 && ny == y1) {
						if(board[nx][ny] == '.') {
							board[nx][ny] = 'X';
							queue.add(new int[] {nx, ny});
						}
						else {
							return "YES";
						}
					}
					else if(board[nx][ny] != 'X') {
						queue.add(new int[] {nx, ny});
						board[nx][ny] = 'X';
					}
				}
			}
		}
		return "NO";
	}
}
