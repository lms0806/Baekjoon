import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int n;
	static char[][] board;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		board = new char[n][n];
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		System.out.print(bfs());
	}
	
	public static String bfs() {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[n][n];
		queue.add(new int[] {0, 0});
		visited[0][0] = true;
		
		int[] dx = {1, 0};
		int[] dy = {0, 1};
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == n - 1 && now[1] == n - 1) {
				return "Yes";
			}
			
			for(int i = 0; i < 2; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
					if(!visited[nx][ny] && board[nx][ny] == '.') {
						queue.add(new int[] {nx, ny});
						visited[nx][ny] = true;
					}
				}
			}
		}
		return "No";
	}
}
