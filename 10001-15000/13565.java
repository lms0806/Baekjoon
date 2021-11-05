import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static boolean[][] visited;
	static int[][] arr;
	static int n, m;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < m; j++) {
				arr[i][j] = s.charAt(j) - '0';
			}
		}
		
		for(int i = 0; i < m; i++) {
			if(arr[0][i] == 0 && !visited[0][i]) {
				bfs(i);
			}
		}
		
		System.out.print(solve());
	}
	
	public static void bfs(int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {0, y});
		visited[0][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nextx = now[0] + dx[i];
				int nexty = now[1] + dy[i];
				
				if(nextx >= 0 && nextx < n && nexty >= 0 && nexty < m) {
					if(arr[nextx][nexty] == 0 && !visited[nextx][nexty]) {
						visited[nextx][nexty] = true;
						queue.add(new int[] {nextx, nexty});
					}
				}
			}
		}
	}
	
	public static String solve() {
		for(int i = 0; i < m; i++) {
			if(visited[n - 1][i]) {
				return "YES";
			}
		}
		return "NO";
	}
}
