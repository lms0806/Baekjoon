import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		char[][] board = new char[n][m], afterboard = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, -1, 0, 1};
		int x1 = n, y1 = m, x2 = 0, y2 = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(board[i][j] == '.') {
					afterboard[i][j] = '.';
					continue;
				}
				
				int count = 0;
				for(int k = 0; k < 4; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					
					if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
						if(board[nx][ny] == '.') {
							count++;
						}
					}
					else {
						count++;
					}
				}
				afterboard[i][j] = count >= 3 ? '.' : 'X';
				
				if(afterboard[i][j] == 'X') {
					if(x1 > i) {
						x1 = i;
					}
					if(y1 > j) {
						y1 = j;
					}
					if(x2 < i) {
						x2 = i;
					}
					if(y2 < j) {
						y2 = j;
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = x1; i <= x2; i++) {
			for(int j = y1; j <= y2; j++) {
				sb.append(afterboard[i][j]);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
