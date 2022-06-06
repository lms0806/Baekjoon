import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static char[][] board;
	static int n, m;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			
			board = new char[n][m];
			
			int x = 0, y = 0;
			for(int j = 0; j < n; j++) {
				board[j] = br.readLine().toCharArray();
				for(int k = 0; k < m; k++) {
					if(board[j][k] == 'S') {
						x = j;
						y = k;
					}
				}
			}
			
			sb.append("Data Set ").append(i).append(":\n").append(bfs(x, y)).append("\n\n");
		}
		System.out.print(sb);
	}
	
	public static int bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		int[][] visited = new int[n][m];
		queue.add(new int[] {x, y, 0});
		
		for(int[] v : visited) {
			Arrays.fill(v, 4);
		}
		
		int answer = 0;
		int[][] count = new int[n][m];
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(visited[now[0]][now[1]] < now[2]) {
				continue;
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(board[nx][ny] == 'P' && visited[nx][ny] != 0 || board[nx][ny] != 'G' && now[2] < visited[nx][ny] || now[2] + 1 < visited[nx][ny]) {
						if(board[nx][ny] == 'H' && count[nx][ny] == 0) {
							count[nx][ny] = 1;
							answer++;
						}
						
						int counts = board[nx][ny] == 'P' ? 0 : board[nx][ny] == 'G' ? now[2] + 1 : now[2];
							
						visited[nx][ny] = counts;
						queue.add(new int[] {nx, ny, counts});
					}
				}
			}
		}
		return answer;
	}
}
