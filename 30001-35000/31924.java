import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		char[][] board = new char[n][];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - 4; j++) {
				if(check(board[i][j], board[i][j + 1], board[i][j + 2], board[i][j + 3], board[i][j + 4])) {
					answer++;
				}
				if(check(board[j][i], board[j + 1][i], board[j + 2][i], board[j + 3][i], board[j + 4][i])) {
					answer++;
				}
			}
		}
		
		for(int i = 0; i < n - 4; i++) {
			for(int j = 0; j < n - 4; j++) {
				if(check(board[i][j + 4], board[i + 1][j + 3], board[i + 2][j + 2], board[i + 3][j + 1], board[i + 4][j])) {
					answer++;
				}
				if(check(board[i][j], board[i + 1][j + 1], board[i + 2][j + 2], board[i + 3][j + 3], board[i + 4][j + 4])) {
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
	
	public static boolean check(char a, char b, char c, char d, char e) {
		return "MOBIS".equals(a + "" + b + "" + c + "" + d + "" + e) || "SIBOM".equals(a + "" + b + "" + c + "" + d + "" + e);
	}
}
