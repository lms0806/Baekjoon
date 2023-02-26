import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sy = Integer.parseInt(st.nextToken()) - 1, sx = Integer.parseInt(st.nextToken()) - 1;
		int ey = Integer.parseInt(st.nextToken()) - 1, ex = Integer.parseInt(st.nextToken()) - 1;
		
		arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.print(arr[sx][sy] == -1 || arr[ex][ey] == -1 ? -1 : dijkstra(sx, sy, ex, ey));
	}
	
	public static long dijkstra(int sx, int sy, int ex, int ey) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		long[][] dist = new long[n][n];
		
		for(int i = 0; i < n; i++) {
			Arrays.fill(dist[i], Long.MAX_VALUE);
		}
		
		dist[sx][sy] = arr[sx][sy];
		pq.add(new Node(sx, sy, dist[sx][sy]));
		
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] != -1) {
					if(dist[nx][ny] > dist[now.x][now.y] + arr[nx][ny]) {
						dist[nx][ny] = dist[now.x][now.y] + arr[nx][ny];
						pq.add(new Node(nx, ny, dist[nx][ny]));
					}
				}
			}
		}
		
		return dist[ex][ey] == Long.MAX_VALUE ? -1 : dist[ex][ey];
	}
}

class Node implements Comparable<Node>{
	int x, y;
	long cost;
	
	public Node(int x, int y, long cost) {
		this.x = x;
		this.y = y;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node o) {
		return (int) (this.cost - o.cost);
	}
}
