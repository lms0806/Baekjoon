import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int n;
	static char[][] board;
	static boolean[][] visited;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			n = Integer.parseInt(br.readLine());
			
			board = new char[n + 2][n + 2];
			visited = new boolean[n + 2][n + 2];
			
			for(int i = 1; i <= n; i++) {
				String s = br.readLine();
				for(int j = 1; j <= n; j++) {
					board[i][j] = s.charAt(j - 1);
				}
			}
			
			sb.append(bfs()).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int bfs() {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {0, 0});
		visited[0][0] = true;
		
		int count = (n + 2) * (n + 2);
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			count--;
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n + 2 && ny >= 0 && ny < n + 2 && !visited[nx][ny] && board[nx][ny] != '#') {
					queue.add(new int[] {nx, ny});
					visited[nx][ny] = true;
				}
			}
		}
		return count;
	}
}
