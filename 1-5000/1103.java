import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int n, m, max = 0;
	static boolean flag;
	static char[][] map;
	static int[][] dp;
	static boolean[][] visited;
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		flag = false;
		visited = new boolean[n][m];
		dp = new int[n][m];
		
		visited[0][0] = true;
		dfs(0, 0, 1);
		
		System.out.print(flag ? -1 : max);
	}
	
	public static void dfs(int x, int y, int count) {
		if(count > max) {
			max = count;
		}
		dp[x][y] = count;
		
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i] * (map[x][y] - '0');
			int ny = y + dy[i] * (map[x][y] - '0');
			
			if(nx >= 0 && nx < n && ny >= 0 && ny < m && map[nx][ny] != 'H') {
				if(visited[nx][ny]) {
					flag = true;
					return;
				}
				
				if(dp[nx][ny] > count) {
					continue;
				}
				
				visited[nx][ny] = true;
				dfs(nx, ny, count + 1);
				visited[nx][ny] = false;
			}
		}
	}
}
