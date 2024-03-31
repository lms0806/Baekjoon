import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		char[][] board = new char[n][m];
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		System.out.print(solve(board));
	}
	
	public static String solve(char[][] board) {
		for(int i = 0; i < board[0].length; i++) {
			boolean flag = true;
			for(int j = 0; j < board.length; j++) {
				if(board[j][i] == 'O') {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				return String.valueOf(i + 1);
			}
		}
		return "ESCAPE FAILED";
	}
}
