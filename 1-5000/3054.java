import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static char[][] board;
	static int[] dx = {0, 1, 2, 1, 0, -1, -2, -1};
	static int[] dy = {2, 1, 0, -1, -2, -1, 0, 1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		board = new char[5][1 + 4 * s.length()];
		
		for(int i = 0; i < board.length; i++) {
			Arrays.fill(board[i], '.');
		}
		
		int x = 2, y = 2;
		for(int i = 0; i < s.length(); i++) {
			board[x][y] = s.charAt(i);
			for(int j = 0; j < dx.length; j++) {
				int nx = x + dx[j];
				int ny = y + dy[j];
				
				if(board[nx][ny] == '*') {
					continue;
				}
				
				board[nx][ny] = (i + 1) % 3 == 0 ? '*' : '#';
			}
			
			y += 4;
		}
		
		StringBuilder sb = new StringBuilder();
		for(char[] c : board) {
			sb.append(c).append("\n");
		}
		System.out.print(sb);
	}
}
