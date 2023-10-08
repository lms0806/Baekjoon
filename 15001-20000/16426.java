import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			if(i == 0 || i == n - 1) {
				sb.append("0 ".repeat(m)).append("\n");
				continue;
			}
			for(int j = 0; j < m; j++) {
				if(j == 0 || j == m - 1) {
					sb.append(0).append(" ");
					continue;
				}
				
				boolean flag = true;
				for(int k = 0; k < 4; k++) {
					if(arr[i + dx[k]][j + dy[k]] <= arr[i][j]) {
						flag = false;
						break;
					}
				}
				
				sb.append(flag ? 1 : 0).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
