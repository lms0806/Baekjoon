import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0};
	static int[] dy = {0, 1};
	static int n, count = 0;
	static boolean[][] visited;
	static int[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		visited = new boolean[n][n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		System.out.print(bfs(0, 0));
	}
	
	public static String bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(arr[now[0]][now[1]] == -1) {
				return "HaruHaru";
			}
			
			for(int i = 0; i < 2; i++) {
				int nextx = now[0] + dx[i] * arr[now[0]][now[1]];
				int nexty = now[1] + dy[i] * arr[now[0]][now[1]];
				
				if(nextx >= 0 && nextx < n && nexty >= 0 && nexty < n) {
					if(!visited[nextx][nexty]) {
						queue.add(new int[] {nextx, nexty});
						visited[nextx][nexty] = true;
					}
				}
			}
		}
		return "Hing";
	}
}
