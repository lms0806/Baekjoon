import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0, 1, 1, -1, -1};
	static int[] dy = {0, 1, 0, -1, 1, -1, 1, -1};
	static int n, m;
	static char[][] board;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		int starty = Integer.parseInt(st.nextToken()) - 1, startx = n - Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		System.out.print(bfs(startx, starty));
	}
	
	public static int bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[n][m];
		queue.add(new int[] {x, y, 0});
		visited[x][y] = true;
		
		int answer = -1;
		while(!queue.isEmpty()) {
			int size = queue.size();
			
			answer++;
			while(size --> 0) {
				int[] now = queue.poll();
				
				for(int i = 0; i < 8; i++) {
					int nx = now[0] + dx[i];
					int ny = now[1] + dy[i];
					
					if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
						if(!visited[nx][ny] && board[nx][ny] != '*') {
							queue.add(new int[] {nx, ny, now[2] + 1});
							visited[nx][ny] = true;
						}
					}
				}
			}
		}
		
		return answer;
	}
}
