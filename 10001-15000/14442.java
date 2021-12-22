import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int n, m, k, answer = Integer.MAX_VALUE;
	static char[][] board;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		bfs();
		
		System.out.print(answer == Integer.MAX_VALUE ? -1 : answer);
	}
	
	public static void bfs() {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][][] visited = new boolean[n][m][k + 1];
		queue.add(new int[] {0, 0, 0, 1});
		visited[0][0][0] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == n - 1 && now[1] == m - 1) {
				answer = Math.min(answer, now[3]);
				return;
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(board[nx][ny] == '0' && !visited[nx][ny][now[2]]) {
						queue.add(new int[] {nx, ny, now[2], now[3] + 1});
						visited[nx][ny][now[2]] = true;
					}
					else if(board[nx][ny] == '1' && now[2] + 1 <= k && !visited[nx][ny][now[2] + 1]) {
						queue.add(new int[] {nx, ny, now[2] + 1, now[3] + 1});
						visited[nx][ny][now[2] + 1] = true;
					}
				}
			}
		}
	}
}
