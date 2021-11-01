import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int m, n, count;
	static boolean[][] visited;
	static int[][] num;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		num = new int[n][m];
		while(k --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
			int arrx = Integer.parseInt(st.nextToken()), arry = Integer.parseInt(st.nextToken());
			
			for(int i = x; i < arrx; i++) {
				for(int j = y; j < arry; j++) {
					num[i][j] = 1;
				}
			}
		}
		
		visited = new boolean[n][m];
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(num[i][j] == 0 && !visited[i][j]) {
					count = 0;
					bfs(i, j);
					arr.add(count);
				}
			}
		}
		
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		sb.append(arr.size()).append("\n");
		for(int a : arr) {
			sb.append(a).append(" ");
		}
		System.out.print(sb);
	}

	public static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] { x, y });
		visited[x][y] = true;
		
		while (!queue.isEmpty()) {
			int[] data = queue.poll();
			int curx = data[0], cury = data[1];

			for (int i = 0; i < 4; i++) {
				int nextx = curx + dx[i], nexty = cury + dy[i];
				
				if (nextx >= 0 && nextx < n && nexty >= 0 && nexty < m) {
					if(!visited[nextx][nexty] && num[nextx][nexty] == 0) {
						visited[nextx][nexty] = true;
						queue.offer(new int[] {nextx, nexty});
					}
				}
			}
			count++;
		}
	}
}
