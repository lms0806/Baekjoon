import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		
		char[][] board = new char[m][n];
		for(int i = 0; i < m; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			int num = 0;
			for(int j = 0; j < m; j++) {
				if(j + 1 < m && board[j][i] == 'X' && board[j + 1][i] == '.') {
					for(int k = j + 1; k < m - 1; k++) {
						if(board[k][i] == '#') {
							break;
						}
						if(board[k][i] == 'X') {
							num = 0;
							break;
						}
						num++;
					}
				}
				if(num > 0 && board[j][i] == '#') {
					min = Math.min(min, num);
					num = 0;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = m - 1; j >= 0; j--) {
				if(board[j][i] == 'X' && board[j + min][i] == '.') {
					char temp = board[j][i];
					board[j][i] = board[j + min][i];
					board[j + min][i] = temp;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			sb.append(board[i]).append("\n");
		}
		System.out.print(sb);
	}
}
