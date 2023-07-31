import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		char[][] board = new char[n][m];
		boolean[][] check = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			for(int j = 0; j < m; j++) {
				if(board[i][j] == '#') {
					check[i][j] = true;
				}
			}
		}
		
		int[] dx = {1, 1, 0};
		int[] dy = {0, 1, 1};
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(check[i][j] && board[i][j] == '#') {
					for(int k = 0; k < 3; k++) {
						board[i + dx[k]][j + dy[k]] = '#';
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(char[] c : board) {
			sb.append(new String(c)).append("\n");
		}
		System.out.print(sb);
	}
}
