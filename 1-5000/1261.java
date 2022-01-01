import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int n, m;
	static int[][] arr, answer;
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		answer = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < m; j++) {
				arr[i][j] = s.charAt(j) - '0';
			}
			Arrays.fill(answer[i], Integer.MAX_VALUE);
		}
		
		bfs(0, 0);
		
		System.out.print(answer[n - 1][m - 1]);
	}
 	
 	public static int bfs(int x, int y) {
 		Queue<int[]> queue = new LinkedList<>();
 		queue.add(new int[] {x, y});
 		answer[x][y] = 0;
 		
 		while(!queue.isEmpty()) {
 			int[] now = queue.poll();
 			
 			for(int i = 0; i < 4; i++) {
 				int nx = now[0] + dx[i];
 				int ny = now[1] + dy[i];
 				
 				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
 					if(arr[nx][ny] == 1) {
 						if(answer[nx][ny] > answer[now[0]][now[1]] + 1) {
 							answer[nx][ny] = answer[now[0]][now[1]] + 1;
 							queue.add(new int[] {nx, ny});
 						}
 					}
 					else {
 						if(answer[nx][ny] > answer[now[0]][now[1]]) {
 							answer[nx][ny] = answer[now[0]][now[1]];
 							queue.add(new int[] {nx, ny});
 						}
 					}
 				}
 			}
 		}
 		return 0;
 	}
}
