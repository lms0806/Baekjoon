import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static char[][] board;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][][] dist;
	static ArrayList<Point> arr = new ArrayList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		int sx = 0, sy = 0, ex = 0, ey = 0;
		board = new char[n][m];
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			
			for(int j = 0; j < m; j++) {
				if(board[i][j] == 'S') {
					sx = i;
					sy = j;
				}
				else if(board[i][j] == 'H') {
					ex = i;
					ey = j;
				}
			}
		}
		
		dist = new int[2][n][m];
		
		bfs(sx, sy, 0);
		bfs(ex, ey, 1);
		
		int answer = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(board[i][j] == 'F' && dist[0][i][j] > 0 && dist[1][i][j] > 0) {
					answer = Math.min(answer, dist[0][i][j] + dist[1][i][j]);
				}
			}
		}
		System.out.print(answer == Integer.MAX_VALUE ? -1 : answer);
	}
	
	public static int bfs(int sx, int sy, int idx) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[n][m];
		
		queue.add(new int[] {sx, sy, 0});
		visited[sx][sy] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(board[now[0]][now[1]] == 'F') {
				dist[idx][now[0]][now[1]] = now[2];
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(!visited[nx][ny] && board[nx][ny] != 'D') {
						queue.add(new int[] {nx, ny, now[2] + 1});
						visited[nx][ny] = true;
					}
				}
			}
		}
		
		return -1;
	}
}
