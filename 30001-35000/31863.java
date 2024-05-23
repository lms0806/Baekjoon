import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static char[][] board;
	static int[][] count;
	static Queue<Point> queue;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		count = new int[n][m];
		queue = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			Arrays.fill(count[i], -1);
			for(int j = 0; j < m; j++) {
				if(board[i][j] == '*') {
					count[i][j] = 1;
				}
				else if(board[i][j] == '#') {
					count[i][j] = 2;
				}
				else if(board[i][j] == '@') {
					queue.add(new Point(i, j));
				}
			}
		}

		Point p = queue.poll();
		bomb(p.x, p.y, 2);
		
		while(!queue.isEmpty()) {
			p = queue.poll();
			
			bomb(p.x, p.y, 1);
		}
		
		int a = 0, b = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(count[i][j] == 0) {
					a++;
				}
				else if(count[i][j] > 0) {
					b++;
				}
			}
		}
		System.out.print(a + " " + b);
	}
	
	public static void bomb(int x, int y, int area) {
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		
		for(int i = 0; i < 4; i++) {
			int nx = x;
			int ny = y;
			for(int j = 0; j < area; j++) {
				nx += dx[i];
				ny += dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(board[nx][ny] == '|') {
						break;
					}
					
					if(count[nx][ny] > 0) {
						if(--count[nx][ny] == 0){
							queue.add(new Point(nx, ny));
						}
					}
				}
			}
		}
	}
}
