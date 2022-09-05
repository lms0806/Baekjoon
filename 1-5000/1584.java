import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int[][] board = new int[502][502];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken()), y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken()), y2 = Integer.parseInt(st.nextToken());
			
			for(int i = Math.min(x1, x2); i <= Math.max(x1, x2); i++) {
				for(int j = Math.min(y1, y2); j <= Math.max(y1, y2); j++) {
					board[i][j] = 1;
				}
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		
		while(m --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken()), y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken()), y2 = Integer.parseInt(st.nextToken());
			
			for(int i = Math.min(x1, x2); i <= Math.max(x1, x2); i++) {
				for(int j = Math.min(y1, y2); j <= Math.max(y1, y2); j++) {
					board[i][j] = 2;
				}
			}
		}
		
		System.out.print(bfs());
	}
	
	public static int bfs() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		boolean[][] visited = new boolean[501][501];
		pq.add(new Node(0, 0, 0));
		visited[0][0] = true;
		
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(now.x == 500 && now.y == 500) {
				return now.hp;
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(nx >= 0 && nx < 501 && ny >= 0 && ny < 501) {
					if(!visited[nx][ny]){
						if(board[nx][ny] == 0) {
							pq.add(new Node(nx, ny, now.hp));
							visited[nx][ny] = true;
						}
						else if(board[nx][ny] == 1) {
							pq.add(new Node(nx, ny, now.hp + 1));
							visited[nx][ny] = true;
						}
					}
				}
			}
		}
		
		
		return -1;
	}
}

class Node implements Comparable<Node>{
	int x, y, hp;
	
	public Node(int x, int y, int hp) {
		this.x = x;
		this.y = y;
		this.hp = hp;
	}

	@Override
	public int compareTo(Node o) {
		return this.hp - o.hp;
	}
}
