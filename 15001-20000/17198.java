import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int n;
	static int[][] arr;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		arr = new int[11][11];
		visited = new boolean[11][11];
		
		int x = 0, y = 0;
		for(int i = 1; i <= 10; i++) {
			char[] ch = br.readLine().toCharArray();
			for(int j = 1; j <= 10; j++) {
				arr[i][j] = ch[j - 1];
				if(ch[j - 1] == 'L') {
					x = i;
					y = j;
				}
			}
		}
		
		System.out.print(bfs(x, y));
	}
	
	public static int bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y, 0});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < 11 && ny >= 0 && ny < 11) {
					if(!visited[nx][ny] && arr[nx][ny] != 'R') {
						visited[nx][ny] = true;
						queue.add(new int[] {nx, ny, now[2] + 1});
					}
					if(arr[nx][ny] == 'B') {
						return now[2];
					}
				}
			}
			
		}
		return -1;
	}
}
