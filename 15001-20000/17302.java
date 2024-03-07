import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int[][] arr;
	static char[][] board;
	static int[] dx = {0, 1, 0, -1, 0};
	static int[] dy = {0, 0, 1, 0, -1};
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		board = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		for(int i = 0; i < n; i++) {
			Arrays.fill(arr[i], 3);
			
			for(int j = 0; j < m; j++) {
				reverse(i, j);
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(board[i][j] == 'B') {
					arr[i][j] = 2;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(1).append("\n");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static void reverse(int x, int y) {
		for(int i = 0; i < 5; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
				board[nx][ny] = board[nx][ny] == 'W' ? 'B' : 'W';
			}
		}
	}
}
