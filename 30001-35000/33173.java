import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		boolean[][] visited = new boolean[n][m];
		
		int[] dx = {1, 0, 1, 0};
		int[] dy = {0, 1, 1, 0};
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int q = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken()) - 1, y = Integer.parseInt(st.nextToken()) - 1;
			
			if(q == 1) {
				int num = Integer.parseInt(st.nextToken());
				for(int i = 0; i < 4; i++) {
					int nx = x + dx[i], ny = y + dy[i];
					
					if(check(nx, ny) && !visited[nx][ny]) {
						arr[nx][ny] = num;
					}
				}
			}
			else {
				for(int i = 0; i < 4; i++) {
					int nx = x + dx[i], ny = y + dy[i];
					
					if(check(nx, ny)) {
						visited[nx][ny] = true;
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) { 
				sb.append(arr[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static boolean check(int x, int y) {
		return x >= 0 && x < n && y >= 0 && y < m;
	}
}
