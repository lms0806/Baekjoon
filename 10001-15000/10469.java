import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[][] board = new char[8][8];
		
		for(int i = 0; i < 8; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		System.out.print(solve(board));
	}
	
	public static String solve(char[][] board) {
		int count = 0;
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(board[i][j] == '*') {
					count++;
					for(int k = i + 1; k < 8; k++) {
						if(board[k][j] == '*') {
							return "invalid";
						}
					}
					for(int k = j + 1; k < 8; k++) {
						if(board[i][k] == '*') {
							return "invalid";
						}
					}
					
					for(int k = i + 1, l = j - 1; k < 8 && l >= 0; k++, l--) {
						if(board[k][l] == '*') {
							return "invalid";
						}
					}
					for(int k = i + 1, l = j + 1; k < 8 && l < 8; k++, l++) {
						if(board[k][l] == '*') {
							return "invalid";
						}
					}
				}
			}
		}
		return count != 8 ? "invalid" : "valid";
	}
}
