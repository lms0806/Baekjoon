import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		char[][] board = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		int[] arr = new int[5];
		for(int i = 0; i <= n - 2; i++) {
			for(int j = 0; j <= m - 2; j++) {
				int count = check(i, j, board);
				
				if(count != -1) {
					arr[count]++;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int a : arr) {
			sb.append(a).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int check(int x, int y, char[][] board) {
		int count = 0;
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				if(board[x + i][y + j] == '#') {
					return -1;
				}
				else if(board[x + i][y + j] == 'X') {
					count++;
				}
			}
		}
		return count;
	}
}
