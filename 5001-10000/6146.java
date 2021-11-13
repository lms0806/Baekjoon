import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int x, y;
	static int[][] arr;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		x = Integer.parseInt(st.nextToken()) + 500;
		y = Integer.parseInt(st.nextToken()) + 500;
		int n = Integer.parseInt(st.nextToken());
		
		arr = new int[1001][1001];
		visited = new boolean[1001][1001];
		
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			arr[Integer.parseInt(st.nextToken()) + 500][Integer.parseInt(st.nextToken()) + 500] = 1;
		}
		
		System.out.print(bfs());
	}
	
	public static int bfs() {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {500, 500, 0});
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < 1001 && ny >= 0 && ny < 1001) {
					if(nx == x && ny == y) {
						return now[2] + 1;
					}
					if(!visited[nx][ny] && arr[nx][ny] != 1) {
						queue.add(new int[] {nx, ny, now[2] + 1});
						visited[nx][ny] = true;
					}
				}
			}
		}
		return -1;
	}
}
