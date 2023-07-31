import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static char[][] board;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		board = new char[n][];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		System.out.print(solve());
	}
	
	public static String solve() {
		for(int i = 0; i < board.length; i++) {
			StringBuilder sb = new StringBuilder();
			for(int j = 0; j < board.length; j++) {
				sb.append(board[j][i]);
			}
			
			if(!new String(board[i]).equals(sb.toString())) {
				return "NO";
			}
		}
		return "YES";
	}
}
