import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, k;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
		
		System.out.print(bfs(s, x, y));
	}
	
	public static int bfs(int s, int x, int y) {
		Queue<int[]>[] queue = new LinkedList[k + 1];
		for(int i = 1; i <= k; i++) {
			queue[i] = new LinkedList<>();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[i][j] != 0) {
					queue[arr[i][j]].add(new int[] {i, j});
				}
			}
		}
		
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		while(s --> 0) {
			for(int i = 1; i <= k; i++) {
				int size = queue[i].size();
				
				while(size --> 0) {
					int[] now = queue[i].poll();
					
					for(int j = 0; j < 4; j++) {
						int nx = now[0] + dx[j];
						int ny = now[1] + dy[j];
						
						if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
							if(arr[nx][ny] == 0) {
								queue[i].add(new int[] {nx, ny});
								arr[nx][ny] = i;
							}
						}
					}
				}
			}
		}
		
		return arr[x - 1][y - 1];
	}
}
