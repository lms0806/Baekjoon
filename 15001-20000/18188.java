import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static char[][] board;
	static char[][] which;
	static int n, m, move;
	static String answer = "NO";
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		
		int x = 0, y = 0;
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			for(int j = 0; j < m; j++) {
				if(board[i][j] == 'D') {
					x = i;
					y = j;
				}
			}
		}
		
		move = Integer.parseInt(br.readLine());
		
		which = new char[move][2];
		for(int i = 0; i < move; i++) {
			st = new StringTokenizer(br.readLine());
			which[i][0] = st.nextToken().charAt(0);
			which[i][1] = st.nextToken().charAt(0);
		}
		
		
		dfs(0, x, y, new ArrayList<>());
		System.out.print(answer);
	}
	
	public static void dfs(int com, int x, int y, ArrayList<Character> arr) {
		if(!answer.equals("NO")) {
			return;
		}
		
		for(int i = com; i < move; i++) {
			boolean flag = false;
			for(int j = 0; j < 2; j++) {
				int dir = check(which[i][j]);
				int nx = x + dx[dir];
				int ny = y + dy[dir];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(board[nx][ny] != '@') {
						arr.add(which[i][j]);
						flag = true;
						
						if(board[nx][ny] == 'Z') {
							answer = "YES\n";
							StringBuilder sb = new StringBuilder();
							for(char c : arr) {
								sb.append(c);
							}
							answer += sb.toString();
							return;
						}
						else {
							dfs(i + 1, nx, ny, arr);
							arr.remove(arr.size() - 1);
							flag = false;
						}
					}
				}
				
			}
			if(!flag) {
				return;
			}
		}
	}
	
	public static int check(char c) {
		return c == 'W' ? 0 : c == 'S' ? 1 : c == 'A' ? 2 : 3;
	}
}
