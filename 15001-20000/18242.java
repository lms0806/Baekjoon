import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		char[][] board = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		ArrayList<int[]> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(board[i][j] == '#') {
					int count = 0;
					for(int k = 0; k < 4; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						
						if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
							if(board[nx][ny] == '#') {
								count++;
							}
						}
					}
					
					if(count == 1) {
						arr.add(new int[] {i, j});
					}
				}
			}
		}
		
		int x = 0, y = 0;
		if(arr.get(0)[0] == arr.get(1)[0]) {
			x = arr.get(0)[0];
			y = arr.get(0)[1] + 1;
		}
		else if(arr.get(0)[1] == arr.get(1)[1]) {
			x = arr.get(0)[0] + 1;
			y = arr.get(0)[1];
		}
		
		System.out.print(solve(board, x, y));
	}
	
	public static String solve(char[][] board, int x, int y) {
		int count = 0;
		for(int i = 0; i < x; i++) {
			if(board[i][y] == '#') {
				count++;
			}
		}
		if(count == 1) {
			return "DOWN";
		}
		
		count = 0;
		for(int i = x; i < board.length; i++) {
			if(board[i][y] == '#') {
				count++;
			}
		}
		if(count == 1) {
			return "UP";
		}
		
		count = 0;
		for(int i = 0; i < y; i++) {
			if(board[x][i] == '#') {
				count++;
			}
		}
		if(count == 1) {
			return "RIGHT";
		}
		
		return "LEFT";
	}
}
