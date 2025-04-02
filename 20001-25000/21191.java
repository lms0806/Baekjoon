import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine().trim());
		
		char[][] board = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		System.out.print(solve(n, board) ? 1 : 0);
	}
	
	public static boolean solve(int n, char[][] board) {
		for(int i = 0; i < n; i++) {
			int b = 0, w = 0;
			for(int j = 0; j < n; j++) {
				if(j < n - 2 && board[i][j] == board[i][j + 1] && board[i][j + 1] == board[i][j + 2]) {
					return false;
				}
				
				if(board[i][j] == 'B') {
					b++;
				}
				else {
					w++;
				}
			}
			
			if(b != w) {
				return false;
			}
			
			for(int j = 0; j < n; j++) {
				if(j < n - 2 && board[j][i] == board[j + 1][i] && board[j + 1][i] == board[j + 2][i]) {
					return false;
				}
				
				if(board[j][i] == 'B') {
					b++;
				}
				else {
					w++;
				}
			}
			
			if(b != w) {
				return false;
			}
		}
		return true;
	}
}
