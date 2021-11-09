import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int[] dx = {1, 0, -1, 0, 1, -1, -1, 1};
	static int[] dy = {0, -1, 0, 1, -1, -1, 1, 1};
	static int n, count;
	static char[][] board;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			n = Integer.parseInt(br.readLine());
			
			board = new char[n][n];
			
			int x = 0, y = 0;
			for(int i = 0; i < n; i++) {
				board[i] = br.readLine().toCharArray();
			}
			
			count = 0;
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(board[i][j] == 'w') {
						bfs(i, j);
					}
				}
			}
			
			bfs(x, y);
			
			sb.append(count).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 8; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
					if(board[nx][ny] == '-') {
						queue.add(new int[] {nx, ny});
						board[nx][ny] = 'w';
						count++;
					}
				}
			}
		}
	}
}
