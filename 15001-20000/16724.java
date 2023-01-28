import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int answer = 0;
	static int[][] check, board;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static char[] d = {'D', 'R', 'U', 'L'};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		board = new int[n][m];
		check = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < m; j++) {
				char c = s.charAt(j);
				
				if(c == 'R') {
					board[i][j] = 1;
				}
				else if(c == 'U') {
					board[i][j] = 2;
				}
				else if(c == 'L') {
					board[i][j] = 3;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(check[i][j] == 0) {
					dfs(i, j);
				}
			}
		}
		System.out.print(answer);
	}
	
	public static void dfs(int x, int y) {
		check[x][y] = 1;
		
		int nx = x + dx[board[x][y]], ny = y + dy[board[x][y]];
		
		if(check[nx][ny] == 1) {
			answer++;
		}
		else if(check[nx][ny] == 0) {
			dfs(nx, ny);
		}
		check[x][y] = 2;
	}
}
