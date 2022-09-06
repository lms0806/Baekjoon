import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int[] dx = {1, 0, -1, 0, 1, 1, -1, -1};
	static int[] dy = {0, 1, 0, -1, 1, -1, 1, -1};
	static int n, m;
	static char[][] board;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		int testcase = 1;
		StringBuilder sb = new StringBuilder();
		while((s = br.readLine()) != null) {
			n = Integer.parseInt(s);
			
			visited = new boolean[n][n];
			board = new char[n][n];
			for(int i = 0; i < n; i++) {
				board[i] = br.readLine().toCharArray();
			}
			
			int answer = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(!visited[i][j] && board[i][j] == '1') {
						bfs(i, j);
						answer++;
					}
				}
			}
			sb.append("Case #").append(testcase).append(": ").append(answer).append("\n");
			testcase++;
		}
		System.out.print(sb);
	}
	
	public static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y, 0});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 8; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
					if(!visited[nx][ny] && board[nx][ny] == '1') {
						queue.add(new int[] {nx, ny});
						visited[nx][ny] = true;
					}
				}
			}
		}
	}
}
