import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0, 0, 0};
	static int[] dy = {0, -1, 0, 1, 0, 0};
	static int[] dz = {0, 0, 0, 0, 1, -1};
	static int l, r, c;
	static char[][][] board;
	static boolean[][][] visited;
	static int[][][] arr;
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			l = Integer.parseInt(st.nextToken());
			r = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			
			if(l == 0 && r == 0 && c == 0) {
				break;
			}
			
			board = new char[l][r][c];
			visited = new boolean[l][r][c];
			arr = new int[l][r][c];
			
			int x = 0, y = 0, z = 0, x1 = 0, y1 = 0, z1 = 0;
			for(int i = 0; i < l; i++) {
				for(int j = 0; j < r; j++) {
					board[i][j] = br.readLine().toCharArray();
					for(int k = 0; k < c; k++) {
						if(board[i][j][k] == 'S') {
							x = i;
							y = j;
							z = k;
						}
						if(board[i][j][k] == 'E') {
							x1 = i;
							y1 = j;
							z1 = k;
						}
					}
				}
				br.readLine();
			}
			
			bfs(x, y, z);
			
			sb.append(visited[x1][y1][z1] ? "Escaped in " + arr[x1][y1][z1] +  " minute(s)." : "Trapped!").append("\n");
		}
		System.out.print(sb);
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
				
				if(nx >= 0 && nx < l && ny >= 0 && ny < r && nz >= 0 && nz < c) {
					if(!visited[nx][ny][nz] && board[nx][ny][nz] != '#') {
						visited[nx][ny][nz] = true;
						arr[nx][ny][nz] = arr[now[0]][now[1]][now[2]] + 1;
						queue.add(new int[] {nx, ny, nz});
					}
				}
			}
		}
	}
}
