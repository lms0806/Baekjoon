import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static char[][] board;
	static boolean[][] visited;
	static int r, c;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			r = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			
			visited = new boolean[r][c];
			board = new char[r][c];
			
			int x = 0, y = 0;
			for(int i = 0; i < r; i++) {
				board[i] = br.readLine().toCharArray();
				if(x == 0 && y == 0) {
					for(int j = 0; j < board[i].length; j++) {
						if(board[i][j] == 'S') {
							x = i;
							y = j;
							break;
						}
					}
				}
			}
			int answer = bfs(x, y);
			sb.append(answer != 0 ? "Shortest Path: " + answer : "No Exit").append("\n");
		}
		System.out.print(sb);
	}
	
	public static int bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y, 0});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(board[now[0]][now[1]] == 'G') {
				return now[2];
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < r && ny >= 0 && ny < c) {
					if(board[nx][ny] != 'X' && board[nx][ny] != 'S' && !visited[nx][ny]) {
						visited[nx][ny] = true;
						queue.add(new int[] {nx, ny, now[2] + 1});
					}
				}
			}
		}
		return 0;
	}
}
