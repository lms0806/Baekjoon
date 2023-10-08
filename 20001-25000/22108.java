import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine().trim());
			
			int[][] arr = new int[n][n];
			
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			sb.append(solve(arr, n) ? "YES" : "NO").append("\n");
		}
		System.out.print(sb);
	}
	
	public static boolean solve(int[][] arr, int n) {
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[i][j] == 0) {
					return true;
				}
				
				for(int k = 0; k < 4; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					
					if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
						if(arr[i][j] == arr[nx][ny]) {
							return true;
						}
					}
				}
			}
		}
		
		return false;
	}
}
