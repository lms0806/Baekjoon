import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static char[][] board;
	static String answer = "NO";
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static ArrayList<int[]> teacher = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		board = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				board[i][j] = st.nextToken().charAt(0);
				
				if(board[i][j] == 'T') {
					teacher.add(new int[] {i, j});
				}
			}
		}
		
		dfs(0);
		
		System.out.print(answer);
	}
	
	public static void dfs(int count) {
		if(count == 3) {
			if(bfs()) {
				answer = "YES";				
			}
			return;
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j] == 'X') {
					board[i][j] = 'O';
					dfs(count + 1);
					board[i][j] = 'X';
				}
			}
		}
	}
	
	public static boolean bfs() {
		for(int[] t : teacher) {
			for(int i = 0; i < 4; i++) {
				int nx = t[0], ny = t[1];
				
				while(true) {
					nx += dx[i];
					ny += dy[i];
					
					if(nx < 0 || nx >= n || ny < 0 || ny >= n) {
						break;
					}
					
					if(board[nx][ny] == 'S') {
						return false;
					}
					if(board[nx][ny] == 'O') {
						break;
					}
				}
			}
		}
		return true;
	}
}
