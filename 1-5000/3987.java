import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static char[][] board;
	static int answer, answerdir;
	static boolean isVoyager = false;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()) - 1, y = Integer.parseInt(st.nextToken()) - 1;

		for(int i = 0; i < 4; i++) {
			if(!isVoyager) {
				move(x, y, i);
			}
		}
		
		char[] which = {'U', 'R', 'D', 'L'};
		
		StringBuilder sb = new StringBuilder();
		sb.append(which[answerdir]).append("\n").append(isVoyager ? "Voyager" : answer);
		System.out.print(sb);
	}
	
	public static void move(int x, int y, int dir) {
		int nx = x, ny = y;
		int count = 1, nxdir = dir;
		
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		while(true) {
			nx = nx + dx[nxdir];
			ny = ny + dy[nxdir];
			
			if(nx < 0 || nx >= n || ny < 0 || ny >= m || board[nx][ny] == 'C') {
				if(answer < count) {
					answer = count;
					answerdir = dir;
				}
				return;
			}
			
			if(nx == x && ny == y && dir == nxdir) {
				answerdir = dir;
				isVoyager = true;
				return;
			}
			
			if(board[nx][ny] == '/') {
				nxdir ^= 1;
			}
			else if(board[nx][ny] == '\\') {
				nxdir = 3 - nxdir;
			}
			
			count++;
		}
	}
}
