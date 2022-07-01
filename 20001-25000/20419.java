import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static char[] which = {'R', 'D', 'L', 'U'};
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	static char[][] board;
	static int n, m, k;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		System.out.print(bfs());
	}
	
	public static String bfs() {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][][][] visited = new boolean[n][m][k + 1][k + 1];
		queue.add(new int[] {0, 0, 0, 0});
		visited[0][0][0][0] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == n - 1 && now[1] == m - 1) {
				return "Yes";
			}
			
			int idx = 0;
			for(int i = 0; i < 4; i++) {
				if(which[i] == board[now[0]][now[1]]) {
					idx = i;
					break;
				}
			}
			
			for(int i = -1; i < 2; i++) {
				int idxs = idx + i;
				if(idxs < 0) {
					idxs += 4;
				}
				if(idxs > 3) {
					idxs -= 4;
				}
				
				int nx = now[0] + dx[idxs];
				int ny = now[1] + dy[idxs];
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(i == -1) {
						if(now[2] < k && !visited[nx][ny][now[2] + 1][now[3]]) {
							queue.add(new int[] {nx, ny, now[2] + 1, now[3]});
							visited[nx][ny][now[2] + 1][now[3]] = true;
						}
					}
					else if(i == 0) {
						if(!visited[nx][ny][now[2]][now[3]]) {
							queue.add(new int[] {nx, ny, now[2], now[3]});
							visited[nx][ny][now[2]][now[3]] = true;
						}
					}
					else {
						if(now[3] < k && !visited[nx][ny][now[2]][now[3] + 1]) {
							queue.add(new int[] {nx, ny, now[2], now[3] + 1});
							visited[nx][ny][now[2]][now[3] + 1] = true;
						}
					}
				}
			}
		}
		return "No";
	}
}
