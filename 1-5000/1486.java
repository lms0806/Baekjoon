import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n, m, t, d;
	static int[][] arr;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		
		PriorityQueue<Node> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < m; j++) {
				char c = s.charAt(j);
				
				if('a' <= c && c <= 'z') {
					arr[i][j] = c - 'a' + 26;
				}
				else {
					arr[i][j] = c - 'A';	
				}
				pq.add(new Node(i, j, arr[i][j]));
			}
		}
		
		int[][] dist = new int[n][m];
		int[][] dist_back = new int[n][m];
		
		dijkstra(0, 0, dist);
		
		int answer = 0;
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			dijkstra(now.x, now.y, dist_back);
			
			if(dist_back[0][0] == Integer.MAX_VALUE || dist[now.x][now.y] == Integer.MAX_VALUE) {
				continue;
			}
			
			if(dist_back[0][0] + dist[now.x][now.y] <= d) {
				answer = now.cost;
				break;
			}
		}
		
		System.out.print(answer);
	}
	
	public static void dijkstra(int x, int y, int[][] dist) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		
		for(int i = 0; i < n; i++) {
			Arrays.fill(dist[i], Integer.MAX_VALUE);
		}
		
		dist[x][y] = 0;
		pq.add(new Node(x, y, 0));
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(dist[now.x][now.y] < now.cost || dist[now.x][now.y] >= d) {
				continue;
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m && Math.abs(arr[nx][ny] - arr[now.x][now.y]) <= t) {
					int nextDist = arr[nx][ny] > arr[now.x][now.y] ? (int)Math.pow(arr[nx][ny] - arr[now.x][now.y], 2) : 1;
					
					if(dist[nx][ny] > dist[now.x][now.y] + nextDist) {
						dist[nx][ny] = dist[now.x][now.y] + nextDist;
						pq.add(new Node(nx, ny, dist[nx][ny]));
					}
				}
			}
		}
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
