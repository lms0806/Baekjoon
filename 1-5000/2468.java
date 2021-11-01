import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };
	static int n;
	static boolean[][] visited;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		arr = new int[n][n];

		int max = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}

		int answer = 0;
		for (int i = 0; i < max; i++) {
			visited = new boolean[n][n];

			int count = 0;
			for (int x = 0; x < n; x++) {
				for (int y = 0; y < n; y++) {
					if (arr[x][y] > i && !visited[x][y]) {
						bfs(x, y, i);
						count++;
					}
				}
			}
			if (answer < count) {
				answer = count;
			}
		}
		System.out.print(answer);
	}

	public static void bfs(int x, int y, int target) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] { x, y });
		visited[x][y] = true;

		while (!queue.isEmpty()) {
			int[] data = queue.poll();
			int curx = data[0], cury = data[1];

			for (int i = 0; i < 4; i++) {
				int nextx = curx + dx[i], nexty = cury + dy[i];

				if (nextx >= 0 && nexty >= 0 && nextx < n && nexty < n) {
					if (!visited[nextx][nexty] && arr[nextx][nexty] > target) {
						visited[nextx][nexty] = true;
						queue.offer(new int[] { nextx, nexty });
					}
				}
			}
		}
	}
}
