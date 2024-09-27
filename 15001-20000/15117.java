import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] board = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				
				board[i][j] = '0' <= c && c <= '9' ? c - '0' : c - 'A' + 10;
			}
		}
		
		System.out.print(solve(board, n));
	}
	
	public static String solve(int[][] board, int n) {
		for(int i = 0; i < n; i++) {
			boolean[] check = new boolean[n];
			for(int j = 0; j < n; j++) {
				if(check[board[i][j]]) {
					return "No";
				}
				check[board[i][j]] = true;
			}
			
			check = new boolean[n];
			
			for(int j = 0; j < n; j++) {
				if(check[board[j][i]]) {
					return "No";
				}
				check[board[j][i]] = true;
			}
		}
		
		for(int i = 1; i < n; i++) {
			if(board[i - 1][0] >= board[i][0] || board[0][i - 1] >= board[0][i]) {
				return "Not Reduced";
			}
		}
		return "Reduced";
	}
}
