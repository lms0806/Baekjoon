import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int[][] board;
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		int idx = 1;
		while(true) {
			n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			board = new int[n][n];
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					board[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			sb.append("Problem ").append(idx).append(": ").append(bfs()).append("\n");
			idx++;
		}
		System.out.print(sb);
	}
	
	public static int bfs() {
		Queue<int[]> queue = new LinkedList<>();
		int[][] visited = new int[n][n];
		queue.add(new int[] {0, 0});
		
		for(int i = 0; i < n; i++) {
			Arrays.fill(visited[i], Integer.MAX_VALUE);
		}
		visited[0][0] = board[0][0];
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
					if(visited[nx][ny] > visited[now[0]][now[1]] + board[nx][ny]) {
						queue.add(new int[] {nx, ny});
						visited[nx][ny] = visited[now[0]][now[1]] + board[nx][ny];
					}
				}
			}
		}
		
		return visited[n - 1][n - 1];
	}
}
