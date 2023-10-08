import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		String s = br.readLine();
		
		char[][] board = new char[n][m];
		boolean[][] visited = new boolean[n][m];
		
		int x = 0, y = 0;
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			
			for(int j = 0; j < m; j++) {
				if(board[i][j] == 'O') {
					x = i;
					y = j;
				}
			}
		}
		

		visited[x][y] = true;
		
		int idx = 0;
		int answer = 1;
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		for(char c : s.toCharArray()) {
			if(c == '^') {
				idx = 0;
			}
			else if(c == '>') {
				idx = 1;
			}
			else if(c == 'v') {
				idx = 2;
			}
			else {
				idx = 3;
			}
			
			while(true) {
				int nx = x + dx[idx];
				int ny = y + dy[idx];
				
				if(board[nx][ny] != '#') {
					if(!visited[nx][ny]) {
						visited[nx][ny] = true;
						answer++;
					}
					
					x = nx;
					y = ny;
				}
				else {
					break;
				}
			}
		}
		System.out.print(answer);
	}
}
