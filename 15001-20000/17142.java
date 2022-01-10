import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int n, m, count;
	static int[][] map;
	static int result = Integer.MAX_VALUE;
	static ArrayList<int[]> arr = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][n];
		
		count = n * n;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				
				if(map[i][j] == 1) {
					count--;
				}
				else if(map[i][j] == 2) {
					count--;
					arr.add(new int[] {i, j});
				}
			}
		}
		
		if(count == 0) {
			System.out.print(0);
		}
		else {
			dfs(0, 0);
			System.out.print(result != Integer.MAX_VALUE ? result : -1);
		}
	}
	
	public static void dfs(int depth, int start) {
		if(depth == m) {
			bfs();
			return;
		}
		
		for(int i = start; i < arr.size(); i++) {
			int[] now = arr.get(i);
			
			map[now[0]][now[1]] = 3;
			dfs(depth + 1, i + 1);
			map[now[0]][now[1]] = 2;
		}
	}
	
	public static void bfs() {
		int[][] virus = new int[n][n];
		Queue<int[]> queue = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(map[i][j] == 3) {
					queue.add(new int[] {i, j});
					virus[i][j] = 1;
				}
			}
		}
		
		int cnt = 0;
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
					if(virus[nx][ny] == 0 && map[nx][ny] != 1) {
						virus[nx][ny] = virus[now[0]][now[1]] + 1;
						queue.add(new int[] {nx, ny});
						if(map[nx][ny] == 0) {
							cnt++;
						}
						if(cnt == count) {
							result = Math.min(result, virus[nx][ny] - 1);
						}
					}
				}
			}
		}
	}
}
