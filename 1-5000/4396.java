import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		char[][] board = new char[n][n], click = new char[n][n], result = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		for(int i = 0; i < n; i++) {
			click[i] = br.readLine().toCharArray();
		}
		
		int[] dx = {-1,-1,-1,0,0,0,1,1,1}, dy = {-1,0,1,-1,0,1,-1,0,1};
		
		boolean b = false;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int count = 0;
				if(click[i][j] == 'x') {
					if(board[i][j] == '*') {
						b = true;
					}
					else {
						for(int k = 0; k < dx.length; k++) {
							int x = i + dx[k], y = j + dy[k];
							
							if(x >= 0 && x < n && y >= 0 && y < n && board[x][y] == '*') {
								count++;
							}
						}
						result[i][j] = (char)(count + '0');
					}
				}
				else {
					result[i][j] = '.';
				}
			}
		}
		
		if(b) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(board[i][j] == '*') {
						result[i][j] = '*';
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sb.append(result[i][j]);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
