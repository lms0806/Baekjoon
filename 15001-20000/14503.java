import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int n, m, count;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		count = 1;
		dfs(x, y, d);
		System.out.print(count);
	}
	
	public static void dfs(int x, int y, int d) {
		arr[x][y] = 2;
		
		for(int i = 0; i < 4; i++) {
			d = (d + 3) % 4;
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 0) {
				count++;
				dfs(nx, ny, d);
				
				return;
			}
		}
		
		int back = (d + 2) % 4;
		int nx = x + dx[back];
		int ny = y + dy[back];
		
		if(nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] != 1) {
			dfs(nx, ny, d);
		}
	}
}
