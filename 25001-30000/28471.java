import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static char[][] board;
	static int[] dx = {1, 1, -1, -1, -1, 0, 0};
	static int[] dy = {1, -1, 1, -1, 0, 1, -1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		
		board = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j] == 'F') {
					answer = bfs(i, j);
					break;
				}
			}
			
			if(answer != 0) {
				break;
			}
		}
		System.out.print(answer);
	}
	
	public static int bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[n][n];
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		
		int count = 0;
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 7; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
					if(!visited[nx][ny] && board[nx][ny] == '.') {
						queue.add(new int[] {nx, ny});
						visited[nx][ny] = true;
						count++;
					}
				}
			}
		}
		
		return count;
	}
}
