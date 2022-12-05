import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, m, answer = 0;
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(st.nextToken());
		
		visited[x][y] = true;
		dfs(x, y, count, arr[x][y], -1);
		
		System.out.print(answer);
	}
	
	public static void dfs(int x, int y, int count, int sum, int idx) {
		if(count < 0) {
			return;
		}
		
		answer = Math.max(answer, sum);
		
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny]) {
				count -= idx == -1 || i == idx ? 1 : 2;
				
				visited[nx][ny] = true;
				if(i == idx) {
					dfs(nx, ny, count, sum + arr[nx][ny], i);
				}
				else {
					dfs(nx, ny, count, sum + arr[nx][ny], i);
				}
				visited[nx][ny] = false;
				
				count += idx == -1 || i == idx ? 1 : 2;
			}
		}
	}
}
