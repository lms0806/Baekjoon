import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static long[] arr, tree;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		char[][] board = new char[7][];
		
		for(int i = 0; i < 7; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		int answer = 0;
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				if(board[i][j] != 'o') {
					continue;
				}
				
				if(j > 1 && board[i][j - 1] == 'o' && board[i][j - 2] == '.') {
					answer++;
				}
				if(i > 1 && board[i - 1][j] == 'o' && board[i - 2][j] == '.') {
					answer++;
				}
				if(j < 5 && board[i][j + 1] == 'o' && board[i][j + 2] == '.') {
					answer++;
				}
				if(i < 5 && board[i + 1][j] == 'o' && board[i + 2][j] == '.') {
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
}
