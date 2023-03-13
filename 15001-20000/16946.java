import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int[][] idxs;
	static char[][] board;
	static boolean[][] visited;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static ArrayList<Integer> arr = new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		idxs = new int[n][m];
		board = new char[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		int idx = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(board[i][j] == '0' && idxs[i][j] == 0) {
					bfs(i, j, idx++);
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(board[i][j] == '1') {
					int answer = 1;
					HashSet<Integer> set = new HashSet<>();
					for(int k = 0; k < 4; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						
						if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == '0' && !set.contains(idxs[nx][ny])) {
							answer += arr.get(idxs[nx][ny] - 1);
							set.add(idxs[nx][ny]);
						}
					}
					sb.append(answer % 10);
				}
				else {
					sb.append(0);
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static void bfs(int x, int y, int idx) {
		Queue<int[]> queue = new LinkedList<>();
		
		visited[x][y] = true;
		queue.add(new int[] {x, y});
		
		int count = 0;
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			idxs[now[0]][now[1]] = idx;
			
			count++;
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(!visited[nx][ny] && board[nx][ny] == '0') {
						visited[nx][ny] = true;
						queue.add(new int[] {nx, ny});
					}
				}
			}
		}
		
		arr.add(count);
	}
}
