import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static char[][] board;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			
			if(n == 0 && m == 0) {
				break;
			}
			
			board = new char[n][m];
			
			int startx = 0, starty = 0;
			for(int i = 0; i < n; i++) {
				board[i] = br.readLine().toCharArray();
				
				for(int j = 0; j < m; j++) {
					if(board[i][j] == 'A') {
						startx = i;
						starty = j;
						break;
					}
				}
			}
			
			sb.append(bfs(startx, starty)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[n][m];
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		
		int answer = 0;
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			answer++;
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(!visited[nx][ny] && board[nx][ny] == '.') {
						queue.add(new int[] {nx, ny});
						visited[nx][ny] = true;
					}
				}
			}
		}
		return answer;
	}
}
