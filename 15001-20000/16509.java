import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[][] dx = {{0, 1, 2}, {1, 2, 3}, {1, 2, 3}, {0, 1, 2}, {0, -1, -2}, {-1, -2, -3}, {-1, -2, -3}, {0, -1, -2}};
	static int[][] dy = {{1, 2, 3}, {0, 1, 2}, {0, -1, -2}, {-1, -2, -3}, {-1, -2, -3}, {0, -1, -2}, {0, 1, 2}, {1, 2, 3}};
	static long s, t;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int x1 = Integer.parseInt(st.nextToken()), y1 = Integer.parseInt(st.nextToken());
		
		System.out.print(bfs(x, y, x1, y1));;
	}
	
	public static int bfs(int x, int y, int x1, int y1) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[10][9];
		queue.add(new int[] {x, y, 0});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 3; j++) {
					int nx = now[0] + dx[i][j];
					int ny = now[1] + dy[i][j];
					
					if(nx < 0 || nx >= 10 || ny < 0 || ny >= 9) {
						break;
					}
					
					if(nx == x1 && ny == y1) {
						if(j == 2) {
							return now[2] + 1;
						}
						else {
							break;
						}
					}
					
					if(!visited[nx][ny] && j == 2) {
						queue.add(new int[] {nx, ny, now[2] + 1});
						visited[nx][ny] = true;
					}
				}
			}
		}
		return -1;
	}
}
