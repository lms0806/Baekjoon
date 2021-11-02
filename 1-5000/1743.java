import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };
	static int[][] arr;
	static boolean[][] visited;
	static int n, m, count = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new boolean[n][m];
		
		while(k --> 0) {
			st = new StringTokenizer(br.readLine());
			
			arr[Integer.parseInt(st.nextToken()) - 1][Integer.parseInt(st.nextToken()) - 1] = 1;
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(!visited[i][j] && arr[i][j] == 1) {
					count = 0;
					bfs(i, j);
					answer = Math.max(answer, count);
				}
			}
		}
		System.out.print(answer);
	}
	
	public static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {x, y});
		visited[x][y] = true;
		
		count++;
		while(!queue.isEmpty()) {
			int[] data = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nextx = data[0] + dx[i], nexty = data[1] + dy[i];
				
				if(nextx >= 0 && nextx < n && nexty >=0 && nexty < m) {
					if(!visited[nextx][nexty] && arr[nextx][nexty] == 1) {
						visited[nextx][nexty] = true;
						queue.offer(new int[] {nextx, nexty});
						count++;
					}
				}
			}
		}
	}
}
