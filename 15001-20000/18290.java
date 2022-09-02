import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, m, k, answer = Integer.MIN_VALUE;
	static int[][] arr;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0, 0, 0, 0);
		
		System.out.print(answer);
	}
	
	public static void dfs(int x, int y, int depth, int sum) {
		if(depth == k) {
			answer = Math.max(answer, sum);
			return;
		}
		
		for(int i = x; i < n; i++) {
			for(int j = (i == x ? y : 0); j < m; j++) {
				if(!visited[i][j] && check(i, j)) {
					visited[i][j] = true;
					dfs(i, j, depth + 1, sum + arr[i][j]);
					visited[i][j] = false;
				}
			}
		}
	}
	
	public static boolean check(int x, int y) {
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		
		for(int k = 0; k < 4; k++) {
			int nx = x + dx[k];
			int ny = y + dy[k];
			
			if(nx >= 0 && nx < n && ny >= 0 && ny < m && visited[nx][ny]) {
				return false;
			}
		}
		return true;
	}
}
