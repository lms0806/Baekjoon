import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int n, m, k, answer = 0;
	static char[][] board;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		visited[n - 1][0] = true;
		dfs(n - 1, 0, 1);
		
		System.out.print(answer);
	}
	
	public static void dfs(int x, int y, int depth) {
		if(x == 0 && y == m - 1 && depth == k) {
			answer++;
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] != 'T') {
				if(!visited[nx][ny]) {
					visited[nx][ny] = true;
					dfs(nx, ny, depth + 1);
					visited[nx][ny] = false;
				}
			}
		}
	}
}
