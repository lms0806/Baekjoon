import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static char[][] board;
	static ArrayList<int[]>[] arr;
	static boolean[] key;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			board = new char[n + 2][m + 2];
			key = new boolean[26];
			
			for(int i = 0; i < n + 2; i++) {
				Arrays.fill(board[i], '.');
			}
			
			for(int i = 1; i <= n; i++) {
				String s = br.readLine();
				for(int j = 1; j <= m; j++) {
					board[i][j] = s.charAt(j - 1);
				}
			}
			
			arr = new ArrayList[26];
			for(int i = 0; i < 26; i++) {
				arr[i] = new ArrayList<>();
			}
			
			String s = br.readLine();
			if(!s.equals("0")) {
				for(char c : s.toCharArray()) {
					key[c - 'a'] = true;
				}
			}
			
			sb.append(bfs()).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int bfs() {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[n + 2][m + 2];
		queue.add(new int[] {0, 0});
		visited[0][0] = true;
		
		int answer = 0;
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx < 0 || nx >= n + 2 || ny < 0 || ny >= m + 2) {
					continue;
				}
				if(board[nx][ny] == '*' || visited[nx][ny]) {
					continue;
				}
				
				char map = board[nx][ny];
				if(map >= 'A' && map <= 'Z') {
					if(key[map - 'A']) {
						board[nx][ny] = '.';
						visited[nx][ny] = true;
						queue.add(new int[] {nx, ny});
					}
					else {
						arr[map - 'A'].add(new int[] {nx, ny});
					}
				}
				else if(map >= 'a' && map <= 'z') {
					key[map - 'a'] = true;
					visited[nx][ny] = true;
					queue.add(new int[] {nx, ny});
					
					for(int j = 0; j < 26; j++) {
						if(arr[j].size() != 0 && key[j]) {
							for(int[] a : arr[j]) {
								board[a[0]][a[1]] = '.';
								visited[a[0]][a[1]] = true;
								queue.add(new int[] {a[0], a[1]});
							}
						}
					}
				}
				else {
					if(map == '$') {
						answer++;
					}
					visited[nx][ny] = true;
					queue.add(new int[] {nx, ny});
				}
			}
		}
		return answer;
	}
}
