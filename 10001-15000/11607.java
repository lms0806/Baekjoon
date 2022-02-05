import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int n, m;
	static int[][] board;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < s.length(); j++) {
				board[i][j] = s.charAt(j) - '0';
			}
		}
		
		int answer = bfs();
		
		System.out.print(answer == 0 ? "IMPOSSIBLE" : answer);
	}
	
	public static int bfs() {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {0, 0, 0});
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == n - 1 && now[1] == m - 1) {
				return now[2];
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i] * board[now[0]][now[1]];
				int ny = now[1] + dy[i] * board[now[0]][now[1]];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(!visited[nx][ny]) {
						visited[nx][ny] = true;
						queue.add(new int[] {nx, ny, now[2] + 1});
					}
				}
			}
		}
		return 0;
	}
}
