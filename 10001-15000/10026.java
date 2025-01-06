import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int n;
	static char[][] board;
	static boolean[][] visited;
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		board = new char[n][n];
		
		for (int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		System.out.print(solve(true) + " " + solve(false));
	}
	
	public static int solve(boolean check) {
		int answer = 0;
		visited = new boolean[n][n];
		for(int x = 0; x < n; x++) {
			for(int y = 0; y < n; y++) {
				if(!visited[x][y]) {
					bfs(x, y, board[x][y]);
					answer++;
				}
				
				if(check && board[x][y] == 'G') {
					board[x][y] = 'R';
				}
			}
		}
		return answer;
	}

	public static void bfs(int x, int y, char target) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		visited[x][y] = true;

		while (!queue.isEmpty()) {
			int[] now = queue.poll();

			for (int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i], ny = now[1] + dy[i];

				if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
					if(!visited[nx][ny] && board[nx][ny] == target) {
						visited[nx][ny] = true;
						queue.offer(new int[] {nx, ny});
					}
				}
			}
		}
	}
}
