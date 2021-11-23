import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 1, -1, -1, 2, 2, -2, -2};
	static int[] dy = {2, -2, 2, -2, 1, -1, 1, -1};
	static int n, m;
	static int[][] arr;
	static char[][] board;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		board = new char[n][m];
		
		int x = 0, y = 0;
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			if(x == 0 && y == 0) {
				for(int j = 0; j < m; j++) {
					if(board[i][j] == 'z') {
						x = i;
						y = j;
					}
				}
			}
			Arrays.fill(arr[i], Integer.MAX_VALUE);
		}
		
		int answer = bfs(x,y);
		
		System.out.print(answer != -1 ? answer : "NIE");
	}
	
	public static int bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		arr[x][y] = 0;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(board[now[0]][now[1]] == 'n') {
				return arr[now[0]][now[1]];
			}
			
			for(int i = 0; i < 8; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(board[nx][ny] != 'x' && arr[nx][ny] > arr[now[0]][now[1]] + 1) {
						arr[nx][ny] = arr[now[0]][now[1]] + 1;
						queue.add(new int[] {nx, ny});
					}
				}
			}
		}
		return -1;
	}
}
