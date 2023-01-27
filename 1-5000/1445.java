import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int startx, starty;
	static char[][] board;
	static boolean[][] visited;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			
			for(int j = 0; j < m; j++) {
				if(board[i][j] == 'S') {
					startx = i;
					starty = j;
				}
			}
		}
		
		System.out.print(Dijkstra());
	}
	
	public static String Dijkstra() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(startx, starty, 0, 0));
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny]) {
					visited[nx][ny] = true;
					if(board[nx][ny] == 'F') {
						return now.trash + " " + now.trashcount;
					}
					
					if(board[nx][ny] == 'g') {
						pq.add(new Node(nx, ny, now.trash + 1, now.trashcount));
					}
					else if(board[nx][ny] == '.') {
						boolean trashcount = around_trash(nx, ny);
						pq.add(new Node(nx, ny, now.trash, trashcount ? now.trashcount + 1 : now.trashcount));
					}
				}
			}
		}
		return 0 + " " + 0;
	}
	
	public static boolean around_trash(int x, int y) {
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 'g') {
				return true;
			}
		}
		return false;
	}
}

class Node implements Comparable<Node>{
	int x, y, trash, trashcount;
	
	public Node(int x, int y, int trash, int trashcount) {
		this.x = x;
		this.y = y;
		this.trash = trash;
		this.trashcount = trashcount;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.trash == o.trash) {
			return this.trashcount - o.trashcount;
		}
		return this.trash - o.trash;
	}
}
