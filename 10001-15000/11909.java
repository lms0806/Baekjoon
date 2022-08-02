import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0};
	static int[] dy = {0, 1};
	static int n;
	static int[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.print(solve());
	}
	
	public static int solve() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int[][] mincost = new int[n][n];
		pq.offer(new Node(0, 0, 0));
		
		for(int i = 0; i < n; i++) {
			Arrays.fill(mincost[i], Integer.MAX_VALUE);
		}
		mincost[0][0] = 0;
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(now.x == n - 1 && now.y == n - 1) {
				return now.cost;
			}
			
			for(int i = 0; i < 2; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				int ncost = now.cost;
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
					if(arr[now.x][now.y] <= arr[nx][ny]) {
						ncost += arr[nx][ny] - arr[now.x][now.y] + 1;
					}
					
					if(ncost >= mincost[nx][ny]) {
						continue;
					}
					
					mincost[nx][ny] = ncost;
					pq.add(new Node(nx, ny, ncost));
				}
			}
		}
		return -1;
	}
}

class Node implements Comparable<Node>{
	int x, y, cost;
	
	public Node(int x, int y, int cost) {
		this.x = x;
		this.y = y;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node o) {
		return this.cost - o.cost;
	}
}
