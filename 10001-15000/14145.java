import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int n, m;
	static char[][] board;
	static int[][] count, answer;
	static boolean[][] visited;
	static ArrayList<Integer> arr = new ArrayList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		count = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(!visited[i][j] && board[i][j] == '1') {
					int counts = bfs(i, j, false, 0);
					count[i][j] = counts;
					arr.add(counts);
				}
			}
		}
		
		Collections.sort(arr);
		
		visited = new boolean[n][m];
		answer = new int[n][m];
		
		for(int i = 0; i < arr.size(); i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < m; k++) {
					if(count[j][k] == arr.get(i) && board[j][k] == '1') {
						bfs(j, k, true, i + 1);
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				sb.append(answer[i][j]);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static int bfs(int x, int y, boolean flag, int num) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		
		int counts = 0;
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			counts++;
			
			if(flag) {
				answer[now[0]][now[1]] = num;
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(!visited[nx][ny] && board[nx][ny] == '1') {
						visited[nx][ny] = true;
						queue.add(new int[] {nx, ny});
					}
				}
			}
		}
		return counts;
	}
}
