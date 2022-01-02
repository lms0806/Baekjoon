import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int n, m;
	static int[][] arr;
	static boolean[][] visited;
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new boolean[n][m];
		
		int x = 0, y = 0;
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < m; j++) {
				arr[i][j] = s.charAt(j) - '0';
				if(arr[i][j] == 2) {
					x = i;
					y = j;
				}
			}
		}
		
		int answer = bfs(x, y);
		
		System.out.print(answer == -1 ? "NIE" : "TAK\n" + answer);
	}
 	
 	public static int bfs(int x, int y) {
 		Queue<int[]> queue = new LinkedList<>();
 		queue.add(new int[] {x, y, 0});
 		visited[x][y] = true;
 		
 		int answer = Integer.MAX_VALUE;
 		while(!queue.isEmpty()) {
 			int[] now = queue.poll();
 			
 			if(arr[now[0]][now[1]] > 2) {
 				answer = Math.min(answer, now[2]);
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
 		
 		return answer == Integer.MAX_VALUE ? -1 : answer;
 	}
}
