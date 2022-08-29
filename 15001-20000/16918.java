import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(st.nextToken());
		
		int[][] bobtime = new int[n][m];
		char[][] board = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			for(int j = 0; j < m; j++) {
				if(board[i][j] == 'O') {
					bobtime[i][j] = 3;
				}
			}
		}

		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		
		int time = 0;
		while(time++ < count) {
			if(time % 2 == 0) {
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < m; j++) {
						if(board[i][j] == '.') {
							board[i][j] = 'O';
							bobtime[i][j] = time + 3;
						}
					}
				}
			}
			else {
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < m; j++) {
						if(bobtime[i][j] == time) {
							board[i][j] = '.';
							
							for(int k = 0; k < 4; k++) {
								int nx = i + dx[k];
								int ny = j + dy[k];
								
								if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
									if(board[nx][ny] == 'O' && bobtime[nx][ny] != time) {
										board[nx][ny] = '.';
										bobtime[nx][ny] = 0;
									}
								}
							}
						}
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(char[] c : board) {
			sb.append(c).append("\n");
		}
		System.out.print(sb);
	}
}
