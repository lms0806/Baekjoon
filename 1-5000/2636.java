import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int n, m, count;
	static int[][] arr;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 1) {
					count++;
				}
			}
		}
		
		int sum = 0, answer = 0;
		while(count != 0) {
			answer++;
			sum = count;
			
			visited = new boolean[n][m];
			
			bfs();
		}
		System.out.print(answer + "\n" + sum);
	}
	
	public static void bfs() {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {0, 0});
		visited[0][0] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny]) {
					if(arr[nx][ny] == 1) {
						count--;
						arr[nx][ny] = 0;
					}
					else {
						queue.add(new int[] {nx, ny});
					}
					visited[nx][ny] = true;
				}
			}
		}
	}
}
