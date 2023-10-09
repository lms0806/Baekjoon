import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		
		int t = 1;
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			if(n == 0 && m == 0) {
				break;
			}
			
			char[][] board = new char[n][m];
			
			int x = 0, y = 0;
			for(int i = 0; i < n; i++) {
				board[i] = br.readLine().toCharArray();
				
				for(int j = 0; j < m; j++) {
					if(board[i][j] == 'w' || board[i][j] == 'W') {
						x = i;
						y = j;
					}
				}
			}
			
			boolean flag = false;;
			for(char c : br.readLine().toCharArray()) {				
				int idx = c == 'U' ? 0 : c == 'R' ? 1 : c == 'D' ? 2 : 3;
				
				int nx = x + dx[idx];
				int ny = y + dy[idx];
				
				if(board[nx][ny] == '.' || board[nx][ny] == '+') {
					board[x][y] = board[x][y] == 'W' ? '+' : '.';
					board[nx][ny] = board[nx][ny] == '+' ? 'W' : 'w';
					
					x = nx;
					y = ny;
				}
				else if(board[nx][ny] == 'b' || board[nx][ny] == 'B') {
					int nnx = nx + dx[idx];
					int nny = ny + dy[idx];
					
					if(board[nnx][nny] == '.' || board[nnx][nny] == '+') {
						board[x][y] = board[x][y] == 'W' ? '+' : '.';
						board[nx][ny] = board[nx][ny] == 'B' ? 'W' : 'w';
						board[nnx][nny] = board[nnx][nny] == '+' ? 'B' : 'b';
						
						x = nx;
						y = ny;
					}
				}
				
				if(check(board)) {
					flag = true;
					break;
				}
			}
			
			sb.append("Game ").append(t++).append(": ").append(!flag ? "incomplete" : "complete").append("\n");
			for(char[] c : board) {
				sb.append(c).append("\n");
			}
		}
		System.out.print(sb);
	}
	
	public static boolean check(char[][] c) {
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				if(c[i][j] == 'b') {
					return false;
				}
			}
		}
		return true;
	}
}
