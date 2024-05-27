import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int n;
	static char[][] board;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		board = new char[n * 3][n * 4];
		
		for(int i = 0; i < n * 3; i++) {
			Arrays.fill(board[i], '.');
		}
		
		fill(0, 0, 'G');
		fill(n, n, 'I');
		fill(n * 2, n * 2, 'S');
		fill(n, n * 3, 'T');
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n * 3; i++) {
			sb.append(board[i]).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void fill(int x, int y, char c) {
		for(int i = x; i < x + n; i++) {
			for(int j = y; j < y + n; j++) {
				board[i][j] = c;
			}
		}
	}
}
