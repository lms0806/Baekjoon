import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int result = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[][] board = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < m; j++) {
				board[i][j] = s.charAt(j) == 'W' ? 1 : 0;
			}
		}
		
		for(int i = 0; i < n - 7; i++) {
			for(int j = 0; j < m - 7; j++) {
				solve(board, i, j);
			}
		}
		
		System.out.print(result);
	}
	
	public static void solve(int[][] board, int n, int m) {
		int color = board[n][m];
		
		int count = 0;
		for(int i = n; i < n + 8; i++) {
			for(int j = m; j < m + 8; j++) {
				if(board[i][j] != color) {
					count++;
				}
				
				color = color == 0 ? 1 : 0;
			}
			color = color == 0 ? 1 : 0;
		}
		
		result = Math.min(result, Math.min(count, 64 - count));
	}
}
