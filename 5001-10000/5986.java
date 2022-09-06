import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int[] dx = {1, 0, -1, 0, 0, 0};
	static int[] dy = {0, 1, 0, -1, 0, 0};
	static int[] dz = {0, 0, 0, 0, 1, -1};
	static int n;
	static char[][][] board;
	static boolean[][][] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		board = new char[n][n][n];
		visited = new boolean[n][n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = br.readLine().toCharArray();
			}
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < n; k++) {
					if(!visited[i][j][k] && board[i][j][k] == '*') {
						bfs(i, j, k);
						answer++;
					}
				}
			}
		}
		System.out.print(answer);
	}
	
	public static void bfs(int x, int y, int z) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y, z});
		visited[x][y][z] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 6; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				int nz = now[2] + dz[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < n && nz >= 0 && nz < n) {
					if(!visited[nx][ny][nz] && board[nx][ny][nz] == '*') {
						queue.add(new int[] {nx, ny, nz});
						visited[nx][ny][nz] = true;
					}
				}
			}
		}
	}
}
