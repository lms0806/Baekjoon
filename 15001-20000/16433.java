import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static char[][] board;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken()) - 1, c = Integer.parseInt(st.nextToken()) - 1;
		
		board = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			Arrays.fill(board[i], '.');
		}
		
		bfs(r, c);
		
		StringBuilder sb = new StringBuilder();
		for(char[] ch : board) {
			sb.append(ch).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void bfs(int r, int c) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[n][n];
		
		queue.add(new int[] {r, c});
		visited[r][c] = true;
		
		int[] dx = {1, 1, -1, -1};
		int[] dy = {1, -1, 1, -1};
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			board[now[0]][now[1]] = 'v';
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
					if(!visited[nx][ny]) {
						queue.add(new int[] {nx, ny});
						visited[nx][ny] = true;
					}
				}
			}
		}
	}
}
