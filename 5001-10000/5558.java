import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int n, m, hp = 1;
	static int x, y;
	static char[][] board;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(board[i][j] == 'S') {
					x = i;
					y = j;
				}
			}
		}
		
		int answer = 0;
		for(int i = 0; i < count; i++) {
			visited = new boolean[n][m];
			answer += bfs();
		}
		System.out.print(answer);
	}
	
	public static int bfs() {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y, 0});
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(!visited[nx][ny] && board[nx][ny] != 'X') {
						if('1' <= board[nx][ny] && board[nx][ny] <= '9') {
							if(hp >= board[nx][ny] - '0') {
								hp++;
								board[nx][ny] = '.';
								x = nx;
								y = ny;
								return now[2] + 1;
							}
						}
						queue.add(new int[] {nx, ny, now[2] + 1});
						visited[nx][ny] = true;
					}
				}
			}
		}
		return 0;
	}
}
