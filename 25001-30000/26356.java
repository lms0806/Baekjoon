import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-2, -2, 2, 2, -1, 1, -1, 1};
	static int[] dy = {-1, 1, -1, 1, -2, -2, 2, 2};
	static int n, arrx, arry;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());

			visited = new boolean[n][n];
			
			int x = Integer.parseInt(st.nextToken()) - 1, y = Integer.parseInt(st.nextToken()) - 1;
			
			arrx = Integer.parseInt(st.nextToken()) - 1;
			arry = Integer.parseInt(st.nextToken()) - 1;
			
			sb.append("Case #").append(i).append(": ").append(bfs(x, y)).append("\n\n");
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
