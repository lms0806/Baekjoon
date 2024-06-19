import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-1, -1, -1, 0};
	static int[] dy = {-1, 0, 1, 1};
	static int[][] arr = new int[20][20];
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int answer = -1;
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
			
			arr[x][y] = i % 2 + 1;
			
			if(check(x, y, i % 2 + 1)) {
				answer = i + 1;
				break;
			}
		}
		System.out.print(answer);
	}
	
	public static boolean check(int x, int y, int n) {
		for(int i = 0; i < 4; i++) {
			if(bfs(x, y, i, n)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean bfs(int x, int y, int idx, int n) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[20][20];
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		
		int count = 1;
		int[] ddx = {dx[idx], -dx[idx]}, ddy = {dy[idx], -dy[idx]};
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 2; i++) {
				int nx = now[0] + ddx[i];
				int ny = now[1] + ddy[i];
				
				if(nx >= 0 && nx < 20 && ny >= 0 && ny < 20) {
					if(!visited[nx][ny] && arr[nx][ny] == n) {
						queue.add(new int[] {nx, ny});
						visited[nx][ny] = true;
						count++;
					}
				}
			}
		}
		
		return count == 5;
	}
}
