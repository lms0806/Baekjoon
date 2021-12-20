import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0, 1, -1, -1, 1};
	static int[] dy = {0, -1, 0, 1, -1, -1, 1, 1};
	static int n, m;
	static char[][] board;
	static boolean[][] visited;
	static Queue<int[]> queue = new LinkedList<>();
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(board[i][j] != '.' && board[i][j] != '9') {
					if(counting(i, j) >= (board[i][j] - '0')) {
						queue.add(new int[] {i, j});
						visited[i][j] = true;
					}
				}
			}
		}
		System.out.print(solve());
	}
	
	public static int counting(int x, int y) {
		int num = 0;
		
		for(int k = 0; k < 8; k++) {
			int nx = x + dx[k];
			int ny = y + dy[k];
			
			if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == '.') {
				num++;
			}
		}
		return num;
	}
	
	public static int solve() {
		int answer = 0;
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			
			while(size --> 0) {
				int[] now = queue.poll();
				
				board[now[0]][now[1]] = '.';
				
				for(int i = 0; i < 8; i++) {
					int nx = now[0] + dx[i];
					int ny = now[1] + dy[i];
					
					if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] != '.') {
						if(!visited[nx][ny] && counting(nx ,ny) >= (board[nx][ny] - '0')) {
							queue.add(new int[] {nx, ny});
							visited[nx][ny] = true;
						}
					}
				}
			}
			
			answer++;
		}
		return answer;
	}
}
