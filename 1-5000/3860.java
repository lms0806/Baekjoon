import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static ArrayList<Node>[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1<<16);

		StringBuilder sb = new StringBuilder();
		while(true) {
			System.gc();
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			if(n == 0 && m == 0) {
				break;
			}
			
			boolean[][] stone = new boolean[31][31];
			arr = new ArrayList[n][m];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					arr[i][j] = new ArrayList<>(4);
				}
			}
			
			int g = Integer.parseInt(br.readLine());
			
			while(g --> 0) {
				st = new StringTokenizer(br.readLine());
				
				stone[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = true;
			}
			
			int e = Integer.parseInt(br.readLine());
			
			while(e --> 0) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
				int val = Integer.parseInt(st.nextToken());
				
				arr[a][b].add(new Node(c, d, val));
			}
			
			int[] dx = {1, 0, -1, 0};
			int[] dy = {0, 1, 0, -1};
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					if(arr[i][j].size() != 0 || stone[i][j] || (i == n -1 && j == m - 1)) {
						continue;
					}
					for(int k = 0; k < 4; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						
						if(nx >= 0 && nx < n && ny >= 0 && ny < m && !stone[nx][ny]) {
							arr[i][j].add(new Node(nx, ny, 1));
						}
					}
				}
			}
			
			sb.append(spfa()).append("\n");
			
			
		}
		System.out.print(sb);
	}
	
	public static String spfa() {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[n][m];
		long[][] dist = new long[n][m];
		int[][] cycle = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			Arrays.fill(dist[i], (long)1e18);
		}
		
		queue.add(new int[] {0, 0});
		dist[0][0] = 0;
		cycle[0][0]++;
		visited[0][0] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			int x = now[0], y = now[1];
			
			visited[x][y] = false;
			
			for(Node a : arr[x][y]) {
				if(dist[a.x][a.y] > dist[x][y] + a.cost) {
					dist[a.x][a.y] = dist[x][y] + a.cost;
					
					if(!visited[a.x][a.y]) {
						cycle[a.x][a.y]++;
						
						if(cycle[a.x][a.y] >= n * m) {
							return "Never";
						}
						queue.add(new int[] {a.x, a.y});
						visited[a.x][a.y] = true;
					}
				}
			}
		}
		
		return dist[n - 1][m - 1] == (long)1e18 ? "Impossible" : dist[n - 1][m - 1] + "";
	}
}

class Node{
	int x, y, cost;
	
	public Node(int x, int y, int cost) {
		this.x = x;
		this.y = y;
		this.cost = cost;
	}
}
