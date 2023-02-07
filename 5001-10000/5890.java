import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int startx, starty;
	static int[][] board = new int[1001][1001];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		startx = Integer.parseInt(st.nextToken());
		starty = Integer.parseInt(st.nextToken());
		
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			board[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
		}
		
		System.out.print(dijkstra());
	}
	
	public static int dijkstra() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int[][] dist = new int[1001][1001];
		
		for(int i = 0; i < 1001; i++) {
			Arrays.fill(dist[i], Integer.MAX_VALUE);
		}
		
		pq.add(new Node(startx, starty, 0));
		dist[startx][starty] = 0;
		
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(dist[now.x][now.y] < now.cost) {
				continue;
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(nx >= 0 && nx < 1001 && ny >= 0 && ny < 1001) {
					if(dist[nx][ny] > dist[now.x][now.y] + board[nx][ny]) {
						dist[nx][ny] = dist[now.x][now.y] + board[nx][ny];
						pq.add(new Node(nx, ny, dist[nx][ny]));
					}
				}
				else {
					return now.cost;
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
