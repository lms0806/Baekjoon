import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		
		int[][] dist = new int[n + 1][n + 1];
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i == j) {
					continue;
				}
				
				dist[i][j] = Integer.MAX_VALUE;
			}
		}
		
		int[][] arr = new int[n + 1][3];
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i == j) {
					continue;
				}
				
				if(arr[i][0] == 1 && arr[j][0] == 1) {
					dist[i][j] = Math.min(t, Math.abs(arr[i][1] - arr[j][1]) + Math.abs(arr[i][2] - arr[j][2]));
				}
				else {
					dist[i][j] = Math.abs(arr[i][1] - arr[j][1]) + Math.abs(arr[i][2] - arr[j][2]);
				}
			}
		}

		for (int k = 1; k <= n; k++) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (dist[i][j] > dist[i][k] + dist[k][j]) {
						dist[i][j] = dist[i][k] + dist[k][j];
					}
				}
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			
			sb.append(dist[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]).append("\n");
		}
		System.out.print(sb);
	}
}
