import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			char[][] board = new char[5][];
			
			for(int i = 0; i < 5; i++) {
				board[i] = br.readLine().toCharArray();
			}
			
			sb.append(solve(board)).append("\n");
			
			if(t > 0) {
				br.readLine();
			}
		}
		System.out.print(sb);
	}
	
	public static String solve(char[][] board) {
		int[] dx = {2, 2, 1, -1, -2, -2, -1, 1};
		int[] dy = {1, -1, -2, -2, -1, 1, 2, 2};
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(board[i][j] == '.') {
					continue;
				}
				
				for(int k = 0; k < 8; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					
					if(nx >= 0 && nx < 5 && ny >= 0 && ny < 5 && board[nx][ny] == 'k') {
						return "invalid";
					}
				}
			}
		}
		return "valid";
	}
}
