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
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		int sx = 0, sy = 0, idx = 0;
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			for(int j = 0; j < board[i].length; j++) {
				if(board[i][j] == 'S') {
					sx = i;
					sy = j;
					board[i][j] = '.';
				}
				else if(board[i][j] == 'C') {
					idx++;
					if(idx == 2) {
						board[i][j] = 'D';
					}
				}
			}
		}
		
		System.out.print(bfs(sx, sy));
	}
	
	public static int bfs(int sx, int sy) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][][][][] visited = new boolean[n][m][5][2][2];
		queue.add(new int[] {sx, sy, 0, -1, 0, 0}); //x, y, 횟수, 방향, C갯수
		visited[sx][sy][4][0][0] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[4] == 1 && now[5] == 1) {
				return now[2];
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(i == now[3]) {
					continue;
				}
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(!visited[nx][ny][i][now[4]][now[5]] && board[nx][ny] != '#') {
						int c = now[4];
						int d = now[5];
						
						if(board[nx][ny] == 'C' && c == 0) {
							c++;
						}
						else if(board[nx][ny] == 'D' && d == 0) {
							d++;
						}
						
						queue.add(new int[] {nx, ny, now[2] + 1, i, c, d});
						visited[nx][ny][i][c][d] = true;
					}
				}
			}
		}
		return -1;
	}
}
