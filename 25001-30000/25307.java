import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int[][] board;
	static ArrayList<int[]> arr = new ArrayList<>();
	static int n, m, k;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		 
		board = new int[n][m];
		int x = 0, y = 0;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
				if(board[i][j] == 4) {
					x = i;
					y = j;
				}
				else if(board[i][j] == 3) {
					arr.add(new int[] {i, j});
				}
			}
		}
		System.out.print(bfs(x, y));
	}
	
	public static int bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[n][m];
		queue.add(new int[] {x, y, 0});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(board[now[0]][now[1]] == 2) {
				return now[2];
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				boolean flag = true;
				for(int[] a : arr) {
					if(Math.abs(a[0] - nx) + Math.abs(a[1] - ny) <= k) {
						flag = false;
						break;
					}
				}
				
				if(!flag) {
					continue;
				}
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(!visited[nx][ny] && board[nx][ny] != 1) {
						queue.add(new int[] {nx, ny, now[2] + 1});
						visited[nx][ny] = true;
					}
				}
			}
		}
		
		return -1;
	}
}
