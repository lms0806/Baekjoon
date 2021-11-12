import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int INF = 987654321;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		arr = new int[n + 1][n + 1];
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i != j) {
					arr[i][j] = INF;
				}
			}
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			arr[a][b] = arr[b][a] = cost;
		}
		
		for(int k = 1; k <= n; k++) {
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					arr[i][j] = Math.min(arr[i][j], arr[i][k] + arr[k][j]);
				}
			}
		}
		
		int answer = 0, min = INF;
		for(int i = 1; i <= n; i++) {
			int num = 0;
			for(int j = 1; j <= n; j++) {
				if(i != j) {
					num += arr[i][j];
				}
			}
			
			if(min > num) {
				answer = i;
				min = num;
			}
		}
		System.out.print(answer);
	}
}
