import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
	static int[] dx = {1, 0};
	static int[] dy = {0, 1};
	static char[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		n = Integer.parseInt(br.readLine());
		
		arr = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = st.nextToken().charAt(0);
			}
		}
		
		dfs(arr[0][0] - '0', 0, 0);
		
		System.out.print(max + " " + min);
	}
	
	public static void dfs(int sum, int x, int y) {
		if(x == n - 1 && y == n - 1) {
			max = Math.max(max, sum);
			min = Math.min(min, sum);
			return;
		}
		
		for(int i = 0; i < 2; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx < n && ny < n) {
				for(int j = 0; j < 2; j++) {
					int nnx = nx + dx[j];
					int nny = ny + dy[j];
					
					if(nnx < n && nny < n) {
						char c = arr[nx][ny];
						
						int num = sum;
						if(c == '+') {
							num += arr[nnx][nny] - '0';
						}
						else if(c == '-') {
							num -= arr[nnx][nny] - '0';
						}
						else {
							num *= arr[nnx][nny] - '0';
						}
						dfs(num, nnx, nny);
					}
				}
			}
		}
	}
}
