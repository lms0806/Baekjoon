import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int INF = 987654321;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n + 1][n + 1];
		int[][] path = new int[n + 1][n + 1];
		
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
			
			path[a][b] = a;
			path[b][a] = b;
		}
		
		for(int k = 1; k <= n; k++) {
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					if(arr[i][j] > arr[i][k] + arr[k][j]) {
						arr[i][j] = arr[i][k] + arr[k][j];
						path[i][j] = path[k][j];
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				sb.append(i == j ? "-" : path[j][i]).append(" "); 
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
