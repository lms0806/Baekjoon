import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, min = Integer.MAX_VALUE;
	static int[][] board;
	static boolean[] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		
		board = new int[n][n];
		visited = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0, 0);
		
		System.out.print(min);
	}
	
	public static void dfs(int depth, int which) {
		if(depth == n / 2) {
			int start = 0, link = 0;
			
			for(int i = 0; i < n; i++) {
				for(int j = i + 1; j < n; j++) {
					if(visited[i] && visited[j]) {
						start += board[i][j] + board[j][i];
					}
					else if(!visited[i] && !visited[j]) {
						link += board[i][j] + board[j][i];
					}
				}
			}
			
			min = Math.min(min, Math.abs(start - link));
			return;
		}
		
		for(int i = which + 1; i < n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				dfs(depth + 1, i);
				visited[i] = false;
			}
		}
	}
}
