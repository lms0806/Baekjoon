import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m, x;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		
		arr = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		x = Integer.parseInt(br.readLine());
		
		System.out.print(bfs() ? "ALIVE" : "DEAD");
	}
	
	public static boolean bfs() {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[n][m];
		queue.add(new int[] {0, 0});
		visited[0][0] = true;
		
		if(arr[0][0] != arr[n - 1][m - 1]) {
			return false;
		}
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == n - 1 && now[1] == m - 1) {
				return true;
			}
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {					
					if(!visited[i][j] && arr[0][0] == arr[i][j] && Math.abs(now[0] - i) + Math.abs(now[1] - j) <= x) {
						visited[i][j] = true;
						queue.add(new int[] {i, j});
					}
				}
			}
		}
		return false;
	}
}
