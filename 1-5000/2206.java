import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int n, m;
	static int[][] arr;
	static boolean[][][] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new boolean[n][m][2];
	
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < m; j++) {
				arr[i][j] = s.charAt(j) - '0';
			}
		}
		
		System.out.print(bfs());
	}
	
	public static int bfs() {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {0, 0, 1, 0});
		visited[0][0][0] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == n - 1 && now[1] == m - 1) {
				return now[2];
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(check(nx, ny)) {
					if(!visited[nx][ny][now[3]]) {
						if(arr[nx][ny] == 1 && now[3] + 1 < 2) {
							queue.add(new int[] {nx, ny, now[2] + 1, now[3] + 1});
							visited[nx][ny][now[3]] = true;
						}
						else if(arr[nx][ny] == 0) {
							queue.add(new int[] {nx, ny, now[2] + 1, now[3]});
							visited[nx][ny][now[3]] = true;
						}
					}
				}
			}
		}
		
		return -1;
	}
	
	public static boolean check(int nx, int ny) {
		if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
			return true;
		}
		return false;
	}
}
