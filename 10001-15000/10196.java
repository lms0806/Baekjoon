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
	static int n ,m;
	static char[][] board;
	static int[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int k = 1; k <= t; k++) {
			sb.append("Case: ").append(k).append("\n");
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			board = new char[n][m];
			arr = new int[n][m];
			
			for(int i = 0; i < n; i++) {
				Arrays.fill(arr[i], -1);
			}
			
			for(int i = 0; i < n; i++) {
				board[i] = br.readLine().toCharArray();
				for(int j = 0; j < m; j++) {
					if(board[i][j] == 'X') {
						arr[i][j] = 0;
					}
				}
			}
			
			if(board[0][0] == 'O') {
				bfs();
			}
			
			sb.append("+").append("---+".repeat(m)).append("\n");
			for(int i = 0; i < n; i++) {
				sb.append("|");
				for(int j = 0; j < m; j++) {
					sb.append(" ");
					if(arr[i][j] == -1) {
						sb.append(" ");
					}
					else if(arr[i][j] == 0) {
						sb.append("X");
					}
					else {
						sb.append("M");
					}
					sb.append(" |");
				}
				sb.append("\n").append("+").append("---+".repeat(m)).append("\n");;
			}
			
			sb.append(arr[n - 1][m - 1] == 2 ? "Minions can cross the room" : "Minions cannot cross the room").append(" \n");
		}
		System.out.print(sb);
	}
	
	public static int bfs() {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {0, 0});
		arr[0][0] = 1;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(arr[nx][ny] == -1) {
						arr[nx][ny] = 2;
						queue.add(new int[] {nx, ny});
					}
				}
			}
		}
		return -1;
	}
}
