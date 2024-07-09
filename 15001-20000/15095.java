import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[][] board = new char[5][5];
		
		for(int i = 0; i < 5; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		System.out.print(solve(board));
	}
	
	public static String solve(char[][] board) {
		int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
		int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
		
		int count = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(board[i][j] == 'k') {
					count++;
					for(int k = 0; k < 8; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						
						if(nx >= 0 && nx < 5 && ny >= 0 && ny < 5 && board[nx][ny] == 'k') {
							return "invalid";
						}
					}
				}
			}
		}
		return count == 9 ? "valid" : "invalid";
	}
}
