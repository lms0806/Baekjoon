import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int n, m, d, count;
	static int[][] arr;
	static boolean[][] visited;
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());
			int idx = Integer.parseInt(st.nextToken());
			
			if(m == 0 && n == 0) {
				break;
			}
			
			arr = new int[n][m];
			visited = new boolean[n][m];
			
			int x = 0, y = 0;
			for(int i = 0; i < t; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
				
				arr[a][b] = 1;
				if(idx == i + 1) {
					x = a;
					y = b;
				}
			}
			
			bfs(x, y);
			
			sb.append(count).append("\n");
		}
		System.out.print(sb);
 	}
 	
 	public static void bfs(int x, int y) {
 		Queue<int[]> queue = new LinkedList<>();
 		queue.add(new int[] {x, y});
 		visited[x][y] = true;
 		
 		count = 0;
 		while(!queue.isEmpty()) {
 			int[] now = queue.poll();
 			
 			count++;
 			
 			for(int i = 0; i < 4; i++) {
 				int nx = now[0];
 				int ny = now[1];
 				
 				int dd = 0;
 				while(dd != d) {
 					nx += dx[i];
 					ny += dy[i];
 					
 					if(nx < 0 || nx >= n || ny < 0 || ny >= m) {
 						break;
 					}
 					
 					if(!visited[nx][ny] && arr[nx][ny] == 1) {
 						queue.add(new int[] {nx, ny});
 						visited[nx][ny] = true;
 					}
 					dd++;
 				}
 			}
 		}
 	}
}
