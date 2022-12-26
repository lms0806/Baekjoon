import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static char[][] board;
	static boolean[][] visited;
	static int[][] arr = new int[2][2];
	static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
	static int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		visited = new boolean[n][m];
		
		int idx = 0;
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			for(int j = 0; j < m; j++) {
				if(board[i][j] == 'H') {
					arr[idx][0] = i;
					arr[idx][1] = j;
					idx++;
				}
			}
		}
		
		System.out.print(bfs(arr[0][0], arr[0][1]));
	}
	
	public static String bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == arr[1][0] && now[1] == arr[1][1]) {
				return "JA";
			}
			
			for(int i = 0; i < 8; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(!visited[nx][ny] && board[nx][ny] != '#') {
						queue.add(new int[] {nx, ny});
						visited[nx][ny] = true;
					}
				}
			}
		}
		
		return "NEJ";
	}
}
