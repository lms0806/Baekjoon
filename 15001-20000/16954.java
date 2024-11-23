import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static char[][] board;
	static int[] dx = {1, 1, 1, 0, -1, -1, -1, 0, 0};
	static int[] dy = {1, 0, -1, -1, -1, 0, 1, 1, 0};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		board = new char[8][];
		
		for(int i = 0; i < 8; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		System.out.print(bfs());
	}
	
	public static int bfs() {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][][] visited = new boolean[9][8][8];
		
		queue.add(new int[] {0, 7, 0});
		visited[0][7][0] = true;
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[1] == 0) {
				return 1;
			}
			
			for(int i = 0; i < 9; i++) {
				int nt = now[0] + 1;
				int nx = now[1] + dx[i];
				int ny = now[2] + dy[i];
				
				if(nt >= 8) {
					return 1;
				}
				
				if(nx < 0 || nx >= 8 || ny < 0 || ny >= 8) {
					continue;
				}
				
				if(nx - now[0] >= 0 && board[nx - now[0]][ny] == '#') {
					continue;
				}
				
				if(nx - nt >= 0 && board[nx - nt][ny] == '#') {
					continue;
				}
				
				if(!visited[nt][nx][ny]) {
					queue.add(new int[] {nt, nx, ny});
					visited[nt][nx][ny] = true;
				}
			}
		}
		return 0;
	}
}
