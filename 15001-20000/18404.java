import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
	static int[] dy = {-1, 1, -2, 2, -2, 2, -1 ,1};
	static int n;
	static int[][] num;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken()) + 1;
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n][n];
		num = new int[n][n];
		
		ArrayList<int[]> arr = new ArrayList<>();
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			arr.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) });
		}
		
		bfs(x, y);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.size(); i++) {
			sb.append(num[arr.get(i)[0]][arr.get(i)[1]] + " ");
		}
		System.out.print(sb);
	}
	
	public static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y, 0});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 8; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
					if(!visited[nx][ny]) {
						num[nx][ny] = now[2] + 1;
						visited[nx][ny] = true;
						queue.add(new int[] {nx, ny, now[2] + 1});
					}
				}
			}
		}
	}
}
