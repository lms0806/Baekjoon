import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int n;
	static int[][] arr;
	static char[][] board;
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		board = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			Arrays.fill(arr[i], Integer.MAX_VALUE);
		}
		
		bfs();
		
		System.out.print(arr[n - 1][n - 1]);
	}
	
	public static void bfs() {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {0, 0});
		arr[0][0] = 0;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
					if(arr[nx][ny] > arr[now[0]][now[1]]) {
						arr[nx][ny] = board[nx][ny] == '1' ? arr[now[0]][now[1]] : arr[now[0]][now[1]] + 1;
						queue.add(new int[] {nx, ny});
					}
				}
			}
		}
	}
}
