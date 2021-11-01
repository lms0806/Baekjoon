import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = { 1, 2, 2, 1, -1, -2, -2, -1 };
	static int[] dy = { 2, 1, -1, -2, -2, -1, 1, 2 };
	static int n, arrx, arry;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			n = Integer.parseInt(br.readLine());

			visited = new boolean[n][n];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			arrx = Integer.parseInt(st.nextToken());
			arry = Integer.parseInt(st.nextToken());
			
			sb.append(x == arrx && y == arry ? 0 : bfs(x, y)).append("\n");
		}
		System.out.print(sb);
	}

	public static int bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] { x, y });
		visited[x][y] = true;
		int[][] count = new int[n][n];
		
		while (!queue.isEmpty()) {
			int[] data = queue.poll();
			int curx = data[0], cury = data[1];

			if(curx == arrx && cury == arry) {
				return count[curx][cury];
			}
			
			for (int i = 0; i < 8; i++) {
				int nextx = curx + dx[i], nexty = cury + dy[i];
				
				if (nextx >= 0 && nexty >= 0 && nextx < n && nexty < n) {
					if(!visited[nextx][nexty]) {
						visited[nextx][nexty] = true;
						count[nextx][nexty] = count[curx][cury] + 1;
						queue.offer(new int[] {nextx, nexty});
					}
				}
			}
		}
		return 0;
	}
}
