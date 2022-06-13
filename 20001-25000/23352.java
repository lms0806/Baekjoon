import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int[][] board;
	static int n, m;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new int[n][m];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int answer = 0, length = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(board[i][j] != 0) {
					Node result = bfs(i, j);
					
					if(result.length > length) {
						length = result.length;
						answer = result.sum;
					}
					else if(result.length == length && result.sum > answer) {
						answer = result.sum;
					}
				}
			}
		}
		System.out.print(answer);
	}
	
	public static Node bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[n][m];
		queue.add(new int[] {x, y, 0});
		visited[x][y] = true;
		
		int maxsum = 0, maxlength = 0;
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			int sum = board[x][y] + board[now[0]][now[1]];
			if(now[2] > maxlength) {
				maxlength = now[2];
				maxsum = sum;
			}
			else if(now[2] == maxlength && maxsum > sum){
				maxsum = sum;
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(!visited[nx][ny] && board[nx][ny] != 0) {
						queue.add(new int[] {nx, ny, now[2] + 1});
						visited[nx][ny] = true;
					}
				}
			}
		}
		
		return new Node(maxsum, maxlength);
	}
}

class Node{
	int sum, length;
	
	public Node(int sum, int length) {
		this.sum = sum;
		this.length = length;
	}
}
