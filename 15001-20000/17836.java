import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int n, m, t;
	static int[][] arr;
	static boolean[][] visited;
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.print(bfs());
 	}
 	
 	public static String bfs() {
 		Queue<int[]> queue = new LinkedList<>();
 		queue.add(new int[] {0, 0, 0});
 		visited[0][0] = true;
 		
 		int result = Integer.MAX_VALUE;
 		while(!queue.isEmpty()) {
 			int[] now = queue.poll();
 			
 			if(arr[now[0]][now[1]] == 2) {
 				result = Math.abs(n - 1 - now[0]) + Math.abs(m - 1 - now[1]) + now[2];
 			}
 			
 			if(now[0] == n - 1 && now[1] == m - 1) {
 				result = Math.min(result, now[2]);
 				break;
 			}
 			
 			for(int i = 0; i < 4; i++) {
 				int nx = now[0] + dx[i];
 				int ny = now[1] + dy[i];
 				
 				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
 					if(!visited[nx][ny] && arr[nx][ny] != 1) {
 						queue.add(new int[] {nx, ny, now[2] + 1});
 						visited[nx][ny] = true;
 					}
 				}
 			}
 		}
 		return result > t ? "Fail" : result + "";
 	}
}
