import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static char[][] board;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		System.out.print(solve());
	}
	
	public static String solve() {
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(board[i][j] == 'S') {
					for(int k = 0; k < 4; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						
						if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
							if(board[nx][ny] == 'W') {
								return "0";
							}
							
							if(board[nx][ny] == '.') {
								board[nx][ny] = 'D';
							}
						}
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(1).append("\n");
		for(int i = 0; i < n; i++) {
			sb.append(board[i]).append("\n");
		}
		return sb.toString();
	}
}
