import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		char[][] board = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		System.out.print(solve(board));
	}
	
	public static String solve(char[][] board) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - 2; j++) {
				if(board[i][j] == '.') {
					continue;
				}
				
				if(board[i][j] == board[i][j + 1] && board[i][j + 1] == board[i][j + 2]) {
					return board[i][j] + "";
				}
			}
		}
		
		for(int i = 0; i < n - 2; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j] == '.') {
					continue;
				}
				
				if(board[i][j] == board[i + 1][j] && board[i + 1][j] == board[i + 2][j]) {
					return board[i][j] + "";
				}
			}
		}
		
		for(int i = 0; i < n - 2; i++) {
			for(int j = 0; j < n - 2; j++) {
				if(board[i][j] == '.') {
					continue;
				}
				
				if(board[i][j] == board[i + 1][j + 1] && board[i + 1][j + 1] == board[i + 2][j + 2]) {
					return board[i][j] + "";
				}
			}
		}
		
		for(int i = 0; i < n - 2; i++) {
			for(int j = 2; j < n; j++) {
				if(board[i][j] == '.') {
					continue;
				}
				
				if(board[i][j] == board[i + 1][j - 1] && board[i][j] == board[i + 2][j - 2]) {
					return board[i][j] + "";
				}
			}
		}
		
		return "ongoing";
	}
}
