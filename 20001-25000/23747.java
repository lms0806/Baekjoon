import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static char[][] board, answer;
	static boolean[][] visited;
	static int n, m;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		answer = new char[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			Arrays.fill(answer[i], '#');
		}
		
		st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken()) - 1, y = Integer.parseInt(st.nextToken()) - 1;
		
		for(char c : br.readLine().toCharArray()) {
			if(c == 'W') {
				bfs(x, y);
			}
			else if(c == 'U') {
				x--;
			}
			else if(c == 'D') {
				x++;
			}
			else if(c == 'L') {
				y--;
			}
			else if(c == 'R') {
				y++;
			}
		}
		
		answer[x][y] = '.';
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(check(nx, ny)) {
				answer[nx][ny] = '.';
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(answer[i]).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		answer[x][y] = '.';
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(check(nx, ny) && !visited[nx][ny] && board[nx][ny] == board[x][y]) {
					queue.add(new int[] {nx, ny});
					visited[nx][ny] = true;
					answer[nx][ny] = '.';
				}
			}
		}
	}
	
	public static boolean check(int x, int y) {
		return x >= 0 && x < n && y >= 0 && y < m ? true : false;
	}
}
