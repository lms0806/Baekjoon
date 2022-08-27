import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int size = Math.min(n, m) / 2;
		
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		while(t --> 0) {
			for(int i = 0; i < size; i++) {
				int x = i, y = i;
				
				int value = arr[x][y];
				
				int idx = 0;
				while(idx < 4) {
					int nx = x + dx[idx];
					int ny = y + dy[idx];
					
					if(nx >= i && nx < n - i && ny >= i && ny < m - i) {
						arr[x][y] = arr[nx][ny];
						x = nx;
						y = ny;
					}
					else {
						idx++;
					}
				}
				
				arr[i + 1][i] = value;
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
}
